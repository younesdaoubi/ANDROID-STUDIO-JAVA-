package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DutchGrammarTheorieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dutch_grammar_theorie);
    }
    public void openaGrammarDu(View view){

        startActivity(new Intent(this,DutchGrammarActivity.class));
    }
}