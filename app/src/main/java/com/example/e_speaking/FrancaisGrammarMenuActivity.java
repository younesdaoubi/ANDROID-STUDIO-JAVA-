package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FrancaisGrammarMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_francais_grammar_menu);
    }
    public void openGrammarFr(View view){

        startActivity(new Intent(this,FrancaisGrammarTheorieActivity.class));
    }
}