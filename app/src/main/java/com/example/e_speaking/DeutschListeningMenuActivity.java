package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DeutschListeningMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deutsch_listening_menu);
    }

    public void openDeutschListening1(View view){
        startActivity(new Intent(this,  DeutschListeningEx1Activity.class));
    }
}