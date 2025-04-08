package com.mirea.safrygina.multiactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = findViewById(R.id.edit);
    }
        public void onClickNewActivity(View view) {

            String textToSend = editText.getText().toString();

            Intent intent = new Intent(this, SecondActivity.class);

            intent.putExtra("input_text", textToSend);

            startActivity(intent);
        }
    }
