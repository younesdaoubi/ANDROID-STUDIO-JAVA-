package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EnglishVocabularyMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_vocabulary_menu);
    }

    public void openEnglishVocabularyFruits(View view){

        startActivity(new Intent(this,EnglishVocabularyFruitsActivity.class));
    }

    public void openEnglishVocabularyAnimal(View view){

        startActivity(new Intent(this,EnglishVocabularyAnimalActivity.class));
    }
}