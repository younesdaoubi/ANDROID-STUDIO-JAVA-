package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class EnglishGrammar7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_grammar7);


        final TextView text_enonce = (TextView) findViewById(R.id.textView_enonce);
        String[] tabText = {"am", "have", "is", "are"};

        String text_enon = "Complete with : ";
        for (int i = 0; i < tabText.length; i++) {
            text_enon += tabText[i] + "  ";
        }

        text_enonce.setText(text_enon);
    }





    public void sendMessageGramEn(View view){

        ArrayList<String> responsesList = (ArrayList<String>) getIntent().getSerializableExtra("responsesList");

        EditText tonEdit7 = findViewById(R.id.en_display_msg7);
        String text7 = tonEdit7.getText().toString();

        responsesList.add(text7);


        Intent intent = new Intent (this, EnglishGrammarFeedBackActivity.class);
        intent.putExtra("responsesList", responsesList);
        startActivity(intent);
    }
}