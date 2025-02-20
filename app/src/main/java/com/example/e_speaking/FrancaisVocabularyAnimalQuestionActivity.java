package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class FrancaisVocabularyAnimalQuestionActivity extends AppCompatActivity {

    ArrayList<String> responsesFrAnimal = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_francais_vocabulary_animal_question);
    }

    public void sendResponses(View view){


        EditText tonEdit1 = findViewById(R.id.Fr_responses_Animal1);
        String text1 = tonEdit1.getText().toString();

        EditText tonEdit2 = findViewById(R.id.Fr_responses_animal2);
        String text2 = tonEdit2.getText().toString();

        EditText tonEdit3 = findViewById(R.id.Fr_responses_animal3);
        String text3 = tonEdit3.getText().toString();

        EditText tonEdit4 = findViewById(R.id.Fr_responses_animal4);
        String text4 = tonEdit4.getText().toString();

        EditText tonEdit5 = findViewById(R.id.Fr_responses_animal5);
        String text5 = tonEdit5.getText().toString();

        EditText tonEdit6 = findViewById(R.id.Fr_responses_animal6);
        String text6 = tonEdit6.getText().toString();

        EditText tonEdit7 = findViewById(R.id.Fr_responses_animal7);
        String text7 = tonEdit7.getText().toString();



        responsesFrAnimal.add(text1);
        responsesFrAnimal.add(text2);
        responsesFrAnimal.add(text3);
        responsesFrAnimal.add(text4);
        responsesFrAnimal.add(text5);
        responsesFrAnimal.add(text6);
        responsesFrAnimal.add(text7);

        //Envoie les reponses directement
        //Intent intent2 = new Intent (this, EnglishGrammarFeedBackActivity.class);
        //intent2.putExtra("EXTRA_MESSAGE1", text1);
           /* intent.putExtra("EXTRA_MESSAGE2", text2);
            intent.putExtra("EXTRA_MESSAGE3", text3);
            intent.putExtra("EXTRA_MESSAGE4", text4);
            intent.putExtra("EXTRA_MESSAGE5", text5);
            intent.putExtra("EXTRA_MESSAGE6", text6);
            intent.putExtra("EXTRA_MESSAGE7", text7);*/

        Intent intent = new Intent (this, FrancaisVocabularyAnimalFeedBackActivity.class);
           /* intent.putExtra("EXTRA_MESSAGE2", text2);
            intent.putExtra("EXTRA_MESSAGE3", text3);
            intent.putExtra("EXTRA_MESSAGE4", text4);
            intent.putExtra("EXTRA_MESSAGE5", text5);
            intent.putExtra("EXTRA_MESSAGE6", text6);
            intent.putExtra("EXTRA_MESSAGE7", text7);*/
        intent.putExtra("responsesFrAnimal", responsesFrAnimal);
        startActivity(intent);

    }


}