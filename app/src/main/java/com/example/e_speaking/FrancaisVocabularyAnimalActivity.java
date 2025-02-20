package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FrancaisVocabularyAnimalActivity extends AppCompatActivity {

    ImageView[] image = new ImageView[7];
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_francais_vocabulary_animal);


            image[0] = findViewById(R.id.Francais_animal_audio1);
            image[1] = findViewById(R.id.Francais_animal_audio2);
            image[2] = findViewById(R.id.Francais_animal_audio3);
            image[3] = findViewById(R.id.Francais_animal_audio4);
            image[4] = findViewById(R.id.Francais_animal_audio5);
            image[5] = findViewById(R.id.Francais_animal_audio6);
            image[6] = findViewById(R.id.Francais_animal_audio7);


///////////////////////////////
            image[0].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view){
                    mp = MediaPlayer.create(FrancaisVocabularyAnimalActivity.this,R.raw.fr_girafe);
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
                    mp = MediaPlayer.create(FrancaisVocabularyAnimalActivity.this,R.raw.fr_lion);
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
                    mp = MediaPlayer.create(FrancaisVocabularyAnimalActivity.this,R.raw.fr_chien);
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
                    mp = MediaPlayer.create(FrancaisVocabularyAnimalActivity.this,R.raw.fr_zebre);
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
                    mp = MediaPlayer.create(FrancaisVocabularyAnimalActivity.this,R.raw.fr_chat);
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
                    mp = MediaPlayer.create(FrancaisVocabularyAnimalActivity.this,R.raw.fr_requin);
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
                    mp = MediaPlayer.create(FrancaisVocabularyAnimalActivity.this,R.raw.fr_poisson);
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

        }

        public void openEnglishAnimalQuest(View view){

            startActivity(new Intent(this,FrancaisVocabularyAnimalQuestionActivity.class));
        }
    }