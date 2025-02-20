package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class DeutschVocabularyAnimalQuestionActivity extends AppCompatActivity {


    ArrayList<String> responsesDeAnimal = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deutsch_vocabulary_animal_question);

        }

        public void sendResponses(View view){


            EditText tonEdit1 = findViewById(R.id.de_responses_animal1);
            String text1 = tonEdit1.getText().toString();

            EditText tonEdit2 = findViewById(R.id.de_responses_animal2);
            String text2 = tonEdit2.getText().toString();

            EditText tonEdit3 = findViewById(R.id.de_responses_animal3);
            String text3 = tonEdit3.getText().toString();

            EditText tonEdit4 = findViewById(R.id.de_responses_animal4);
            String text4 = tonEdit4.getText().toString();

            EditText tonEdit5 = findViewById(R.id.de_responses_animal5);
            String text5 = tonEdit5.getText().toString();

            EditText tonEdit6 = findViewById(R.id.de_responses_animal6);
            String text6 = tonEdit6.getText().toString();

            EditText tonEdit7 = findViewById(R.id.de_responses_animal7);
            String text7 = tonEdit7.getText().toString();



            responsesDeAnimal.add(text1);
            responsesDeAnimal.add(text2);
            responsesDeAnimal.add(text3);
            responsesDeAnimal.add(text4);
            responsesDeAnimal.add(text5);
            responsesDeAnimal.add(text6);
            responsesDeAnimal.add(text7);


            Intent intent = new Intent (this, DeutschVocabularyAnimalFeedBackActivity.class);


            intent.putExtra("responsesDeAnimal", responsesDeAnimal);
            startActivity(intent);

        }


    }