package com.mirea.safrygina.serviceapp;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    private Intent playerServiceIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerServiceIntent = new Intent(this, PlayerService.class);

        Button playButton = findViewById(R.id.play_button);
        Button stopButton = findViewById(R.id.stop_button);

        playButton.setOnClickListener(v -> {
            ContextCompat.startForegroundService(this, new Intent(this, PlayerService.class));
            Toast.makeText(this, "Сейчас играет: Алло-Алло! Я больше не доступна!!", Toast.LENGTH_SHORT).show();

        });

        stopButton.setOnClickListener(v -> {
            stopService(playerServiceIntent);
        });
    }
}
