package com.mirea.safrygina.multiactivity;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String inputText = getIntent().getStringExtra("input_text");

        TextView textView = findViewById(R.id.textView);
        textView.setText(inputText);
    }
}
