package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FrancaisVocabularyMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_francais_vocabulary_menu);
    }

    public void openFrancaisVocabularyFruits(View view){

        startActivity(new Intent(this,FrancaisVocabularyFruitsActivity.class));
    }

    public void openFrancaisVocabularyAnimal(View view){

        startActivity(new Intent(this,FrancaisVocabularyAnimalActivity.class));
    }
}