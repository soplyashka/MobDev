package com.mirea.safrygina.sharer;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        Intent intent = getIntent();
        String action = intent.getAction();
        String type = intent.getType();

        if (Intent.ACTION_SEND.equals(action) && type != null) {
            if ("text/plain".equals(type)) {
                handleSendText(intent);
            } else if (type.startsWith("image/")) {
                handleSendImage(intent);
            }
        }
    }

    void handleSendText(Intent intent) {
        String sharedText = intent.getStringExtra(Intent.EXTRA_TEXT);
        if (sharedText != null) {
            TextView textView = findViewById(R.id.textView);
            textView.setText(sharedText);
        }
    }

    void handleSendImage(Intent intent) {
        // Обработка изображения (например, получение URI изображения)
        // Здесь можно добавить логику для работы с изображениями
    }
}
