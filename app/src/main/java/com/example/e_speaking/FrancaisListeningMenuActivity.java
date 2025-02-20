package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FrancaisListeningMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_francais_listening_menu);
    }

    public void openFrancaisListeningActivity1(View view){
        startActivity(new Intent(this,FrancaisListeningEx1Activity.class));
    }
}