package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DutchListeningMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dutch_listening_menu);
    }




    public void openDutchListening1(View view){
        startActivity(new Intent(this,  DutchListeningEx1Activity.class));
    }
}