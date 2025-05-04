package com.mirea.safrygina.lesson4;

import android.os.Bundle;

import android.media.MediaPlayer;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.mirea.safrygina.lesson4.databinding.ActivityMainBinding;



public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MediaPlayer mediaPlayer;
    private boolean isPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.textViewTitle.setText("Алло-алло, я больше не доступна!");


        mediaPlayer = MediaPlayer.create(this, R.raw.allo);

        binding.buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer != null) {
                    if (isPlaying) {
                        mediaPlayer.pause();
                        binding.buttonPlay.setText("▶️");
                        Log.d("Player", "Пауза");
                    } else {
                        mediaPlayer.start();
                        binding.buttonPlay.setText("⏸");
                        Log.d("Player", "Играет");
                    }
                    isPlaying = !isPlaying;
                }
            }
        });

        binding.buttonPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Player", "Кнопка назад");
            }
        });

        binding.buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Player", "Кнопка вперед");
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}