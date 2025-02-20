package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FrancaisVocabularyFruitsActivity extends AppCompatActivity {

    ImageView[] image = new ImageView[7];
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_francais_vocabulary_fruits);

        image[0] = findViewById(R.id.Francais_fruits_audio1);
        image[1] = findViewById(R.id.Francais_fruits_audio2);
        image[2] = findViewById(R.id.Francais_fruits_audio3);
        image[3] = findViewById(R.id.Francais_fruits_audio4);
        image[4] = findViewById(R.id.Francais_fruits_audio5);
        image[5] = findViewById(R.id.Francais_fruits_audio6);
        image[6] = findViewById(R.id.Francais_fruits_audio7);


///////////////////////////////
        image[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mp = MediaPlayer.create(FrancaisVocabularyFruitsActivity.this,R.raw.fr_fraise);
                mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        mp.start();
                    }
                });
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mp.release();
                    }
                });
            }

        });

        ////////////////////////////

        image[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mp = MediaPlayer.create(FrancaisVocabularyFruitsActivity.this,R.raw.fr_banane);
                mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        mp.start();
                    }
                });
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mp.release();
                    }
                });
            }

        });

        ///////////////////////////
        image[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mp = MediaPlayer.create(FrancaisVocabularyFruitsActivity.this,R.raw.fr_orange);
                mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        mp.start();
                    }
                });
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mp.release();
                    }
                });
            }

        });

        ///////////////////////////
        image[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mp = MediaPlayer.create(FrancaisVocabularyFruitsActivity.this,R.raw.fr_ananas);
                mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        mp.start();
                    }
                });
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mp.release();
                    }
                });
            }

        });

        ///////////////////////////
        image[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mp = MediaPlayer.create(FrancaisVocabularyFruitsActivity.this,R.raw.fr_pomme);
                mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        mp.start();
                    }
                });
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mp.release();
                    }
                });
            }

        });

        ///////////////////////////
        image[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mp = MediaPlayer.create(FrancaisVocabularyFruitsActivity.this,R.raw.fr_raisins);
                mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        mp.start();
                    }
                });
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mp.release();
                    }
                });
            }

        });

        ///////////////////////////
        image[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mp = MediaPlayer.create(FrancaisVocabularyFruitsActivity.this,R.raw.fr_pasteque);
                mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        mp.start();
                    }
                });
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mp.release();
                    }
                });
            }

        });

        ///////////////////////////
    }

   /* public void sendMessage(View view) {
        Intent intent = new Intent(this, MyNewActivity.class);
        startActivity(intent);
    }*/

    public void openEnglishFruitspart2(View view){

        startActivity(new Intent(this,FrancaisVocabularyFruits2Activity.class));
    }
}
