package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

import java.util.Timer;
import java.util.TimerTask;

public class DeutschListeningEx1Activity extends AppCompatActivity {


    private MediaPlayer mediaPlayer;
    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deutsch_listening_ex1);

        this.seekBar = (SeekBar) findViewById(R.id.sound_bar);

        this.mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.deutsch_sound_1);

        Timer timer = new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run(){
                seekBar.setProgress(mediaPlayer.getCurrentPosition()/1000);
            }
        },1000,1000);

    }

    public void playSound(View view) {

        Button button = (Button) view;

        if (mediaPlayer.isPlaying()) {//si le media est en train d'être joué on le met sur pause
            mediaPlayer.pause();
            button.setText(getString(R.string.play_music_eng));
        }
        else
        {
            mediaPlayer.start();
            button.setText(getString(R.string.pause_music_eng));
        }
    }


    public void openFrancaisQuiz1(View view){

        mediaPlayer.pause();
        startActivity(new Intent(this,DeutschQuizActivity.class));
    }

}
