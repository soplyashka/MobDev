package com.mirea.safrygina.intentapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.textView);

        String currentTime = getIntent().getStringExtra("current_time");

        int value = 11;
        int square = value * value;
        String displayText = "КВАДРАТ ЗНАЧЕНИЯ " + value + " СОСТАВЛЯЕТ ЧИСЛО " + square + ", а текущее время " + currentTime;

        // Установка текста в TextView
        textView.setText(displayText);
    }
}
