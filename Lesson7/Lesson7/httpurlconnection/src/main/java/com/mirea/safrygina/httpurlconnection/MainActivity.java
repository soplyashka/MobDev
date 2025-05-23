package com.mirea.safrygina.httpurlconnection;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    private TextView tvIp, tvCity, tvRegion, tvLatitude, tvLongitude, tvWeather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvIp = findViewById(R.id.tvIp);
        tvCity = findViewById(R.id.tvCity);
        tvRegion = findViewById(R.id.tvRegion);
        tvLatitude = findViewById(R.id.tvLatitude);
        tvLongitude = findViewById(R.id.tvLongitude);
        tvWeather = findViewById(R.id.tvWeather);

        new Thread(this::getExternalIpInfo).start();
    }

    private void getExternalIpInfo() {
        try {

            URL url = new URL("https://ipinfo.io/json");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            connection.disconnect();

            JSONObject json = new JSONObject(response.toString());
            String ip = json.getString("ip");
            String city = json.getString("city");
            String region = json.getString("region");
            String loc = json.getString("loc"); // координаты "lat,lon"

            String[] parts = loc.split(",");
            double latitude = Double.parseDouble(parts[0]);
            double longitude = Double.parseDouble(parts[1]);

            runOnUiThread(() -> {
                tvIp.setText("IP: " + ip);
                tvCity.setText("Город: " + city);
                tvRegion.setText("Регион: " + region);
                tvLatitude.setText("Широта: " + latitude);
                tvLongitude.setText("Долгота: " + longitude);
            });

            // Шаг 2: Получение погоды
            getWeatherInfo(latitude, longitude);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getWeatherInfo(double lat, double lon) {
        try {
            String weatherUrl = "https://api.open-meteo.com/v1/forecast?latitude=" +
                    lat + "&longitude=" + lon + "&current_weather=true";

            URL url = new URL(weatherUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            connection.disconnect();

            JSONObject json = new JSONObject(response.toString());
            JSONObject currentWeather = json.getJSONObject("current_weather");
            double temperature = currentWeather.getDouble("temperature");
            double windspeed = currentWeather.getDouble("windspeed");

            runOnUiThread(() -> tvWeather.setText("Температура: " + temperature + "°C\n"
                    + "Скорость ветра: " + windspeed + " км/ч"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
