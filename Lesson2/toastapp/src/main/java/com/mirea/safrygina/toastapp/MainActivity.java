package com.mirea.safrygina.toastapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextInput = findViewById(R.id.editTextInput);
        Button buttonCountCharacters = findViewById(R.id.buttonCountCharacters);

        buttonCountCharacters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editTextInput.getText().toString();
                int characterCount = inputText.length();
                String message = "СТУДЕНТ № 11 ГРУППА БИСО-03-20 Количество символов - " + characterCount;

                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
            }
        });
    }
}
