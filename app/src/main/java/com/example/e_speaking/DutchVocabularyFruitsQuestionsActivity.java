package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class DutchVocabularyFruitsQuestionsActivity extends AppCompatActivity {

    ArrayList<String> responsesDuFruits = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dutch_vocabulary_fruits_questions);
    }

    public void sendResponses(View view){


        EditText tonEdit1 = findViewById(R.id.Du_responses_fruits1);
        String text1 = tonEdit1.getText().toString();

        EditText tonEdit2 = findViewById(R.id.Fr_responses_fruits2);
        String text2 = tonEdit2.getText().toString();

        EditText tonEdit3 = findViewById(R.id.Frr_responses_fruits3);
        String text3 = tonEdit3.getText().toString();

        EditText tonEdit4 = findViewById(R.id.Fr_responses_fruits4);
        String text4 = tonEdit4.getText().toString();

        EditText tonEdit5 = findViewById(R.id.Frr_responses_fruits5);
        String text5 = tonEdit5.getText().toString();

        EditText tonEdit6 = findViewById(R.id.Frr_responses_fruits6);
        String text6 = tonEdit6.getText().toString();

        EditText tonEdit7 = findViewById(R.id.Frr_responses_fruits7);
        String text7 = tonEdit7.getText().toString();



        responsesDuFruits.add(text1);
        responsesDuFruits.add(text2);
        responsesDuFruits.add(text3);
        responsesDuFruits.add(text4);
        responsesDuFruits.add(text5);
        responsesDuFruits.add(text6);
        responsesDuFruits.add(text7);

        //Envoie les reponses directement
        //Intent intent2 = new Intent (this, EnglishGrammarFeedBackActivity.class);
        //intent2.putExtra("EXTRA_MESSAGE1", text1);
           /* intent.putExtra("EXTRA_MESSAGE2", text2);
            intent.putExtra("EXTRA_MESSAGE3", text3);
            intent.putExtra("EXTRA_MESSAGE4", text4);
            intent.putExtra("EXTRA_MESSAGE5", text5);
            intent.putExtra("EXTRA_MESSAGE6", text6);
            intent.putExtra("EXTRA_MESSAGE7", text7);*/

        Intent intent = new Intent (this, DutchVocabularyFruitsFeedBackActivity.class);
           /* intent.putExtra("EXTRA_MESSAGE2", text2);
            intent.putExtra("EXTRA_MESSAGE3", text3);
            intent.putExtra("EXTRA_MESSAGE4", text4);
            intent.putExtra("EXTRA_MESSAGE5", text5);
            intent.putExtra("EXTRA_MESSAGE6", text6);
            intent.putExtra("EXTRA_MESSAGE7", text7);*/
        intent.putExtra("responsesDuFruits", responsesDuFruits);
        startActivity(intent);
    }
}