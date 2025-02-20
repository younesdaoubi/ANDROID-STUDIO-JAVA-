package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EnglishListeningMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_listening_menu);
    }


    public void openEnglishListeningActivity1(View view){
        startActivity(new Intent(this,EnglishListeningEx1Activity.class));
    }
}