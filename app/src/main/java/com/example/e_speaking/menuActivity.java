package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void openFrancaisActivity(View view){
        startActivity(new Intent(this, FrancaisMenu.class));
    }

    public void openEnglishActivity(View view){
        startActivity(new Intent(this,EnglishMenu.class));
    }

    public void openDutchActivity(View view){
        startActivity(new Intent(this,DutchMenu.class));
    }

    public void openDeutschActivity(View view){
        startActivity(new Intent(this,DeutschMenu.class));
    }
}