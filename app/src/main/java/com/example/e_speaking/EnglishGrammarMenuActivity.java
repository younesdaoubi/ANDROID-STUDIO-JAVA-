package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EnglishGrammarMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_grammar_menu);
    }

    public void openEnglishGramEx1(View view){

        startActivity(new Intent(this,EnglishGrammarTheorieActivity.class));
    }
}