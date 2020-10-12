package com.example.masterdflow2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    MediaPlayer song = new MediaPlayer();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        song = MediaPlayer.create(this, R.raw.song);
        song.start();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                song.stop();
                finish();

                startActivity(new Intent(Splash.this,websiteListActivity.class));
            }
        };
        Timer t = new Timer();
        t.schedule(task, 5000);


    }
}