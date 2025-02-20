package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class EnglishVocabularyAnimalQuestionActivity extends AppCompatActivity {

    ArrayList<String> responsesEnAnimal = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_vocabulary_animal_question);

    }

    public void sendResponses(View view){


        EditText tonEdit1 = findViewById(R.id.en_responses_animal1);
        String text1 = tonEdit1.getText().toString();

        EditText tonEdit2 = findViewById(R.id.en_responses_animal2);
        String text2 = tonEdit2.getText().toString();

        EditText tonEdit3 = findViewById(R.id.en_responses_animal3);
        String text3 = tonEdit3.getText().toString();

        EditText tonEdit4 = findViewById(R.id.en_responses_animal4);
        String text4 = tonEdit4.getText().toString();

        EditText tonEdit5 = findViewById(R.id.en_responses_animal5);
        String text5 = tonEdit5.getText().toString();

        EditText tonEdit6 = findViewById(R.id.en_responses_animal6);
        String text6 = tonEdit6.getText().toString();

        EditText tonEdit7 = findViewById(R.id.en_responses_animal7);
        String text7 = tonEdit7.getText().toString();



        responsesEnAnimal.add(text1);
        responsesEnAnimal.add(text2);
        responsesEnAnimal.add(text3);
        responsesEnAnimal.add(text4);
        responsesEnAnimal.add(text5);
        responsesEnAnimal.add(text6);
        responsesEnAnimal.add(text7);

        //Envoie les reponses directement
        //Intent intent2 = new Intent (this, EnglishGrammarFeedBackActivity.class);
        //intent2.putExtra("EXTRA_MESSAGE1", text1);
           /* intent.putExtra("EXTRA_MESSAGE2", text2);
            intent.putExtra("EXTRA_MESSAGE3", text3);
            intent.putExtra("EXTRA_MESSAGE4", text4);
            intent.putExtra("EXTRA_MESSAGE5", text5);
            intent.putExtra("EXTRA_MESSAGE6", text6);
            intent.putExtra("EXTRA_MESSAGE7", text7);*/

        Intent intent = new Intent (this, EnglishVocabularyAnimalFeedBackActivity.class);
           /* intent.putExtra("EXTRA_MESSAGE2", text2);
            intent.putExtra("EXTRA_MESSAGE3", text3);
            intent.putExtra("EXTRA_MESSAGE4", text4);
            intent.putExtra("EXTRA_MESSAGE5", text5);
            intent.putExtra("EXTRA_MESSAGE6", text6);
            intent.putExtra("EXTRA_MESSAGE7", text7);*/
        intent.putExtra("responsesEnAnimal", responsesEnAnimal);
        startActivity(intent);

    }


}
