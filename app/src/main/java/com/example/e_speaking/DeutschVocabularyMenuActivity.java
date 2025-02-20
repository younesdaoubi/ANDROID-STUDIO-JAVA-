package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DeutschVocabularyMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deutsch_vocabulary_menu);
    }
    public void openDutchVocabularyFruits(View view){

        startActivity(new Intent(this,DeutschVocabularyFruitsActivity.class));
    }

    public void openDutchVocabularyAnimals(View view){

        startActivity(new Intent(this,DeutschVocabularyAnimalActivity.class));
    }
}