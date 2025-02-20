package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DutchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dutch);


    Intent intent = getIntent();
    String t = "red";
    String text1 = intent.getStringExtra("EXTRA_MESSAGE");
    TextView textView = findViewById(R.id.display_message);
    textView.setText(text1);
        if(text1.equals(t)){
            textView.setText("true");
        }
        else{
            textView.setText("false");
        }
}
}