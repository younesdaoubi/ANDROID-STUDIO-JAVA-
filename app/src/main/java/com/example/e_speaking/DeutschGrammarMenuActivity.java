package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DeutschGrammarMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deutsch_grammar_menu);
    }

    public void openGrammarDe(View view){

        startActivity(new Intent(this,DeutschGrammarTheorieActivity.class));
    }
}