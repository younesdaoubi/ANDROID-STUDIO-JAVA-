package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DutchVocabularyMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dutch_vocabulary_menu);
    }


    public void openDutchVocabularyFruit(View view){

        startActivity(new Intent(this,DutchVocabularyFruitsActivity.class));
    }

    public void openDutchVocabularyAnimal(View view){

        startActivity(new Intent(this,DutchVocabularyAnimalActivity.class));
    }
}