package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class EnglishGrammar4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_grammar4);

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

        EditText tonEdit4 = findViewById(R.id.de_display_msg3);
        String text4 = tonEdit4.getText().toString();

        responsesList.add(text4);

            /*
            EditText tonEdit3 = findViewById(R.id.display_msg3);
            String text3 = tonEdit3.getText().toString();

            EditText tonEdit4 = findViewById(R.id.display_msg4);
            String text4 = tonEdit4.getText().toString();

            EditText tonEdit5 = findViewById(R.id.display_msg5);
            String text5 = tonEdit5.getText().toString();

            EditText tonEdit6 = findViewById(R.id.display_msg6);
            String text6 = tonEdit6.getText().toString();

            EditText tonEdit7 = findViewById(R.id.display_msg7);
            String text7 = tonEdit7.getText().toString();

*/


        Intent intent = new Intent (this, EnglishGrammar5Activity.class);
        intent.putExtra("responsesList", responsesList);
        startActivity(intent);
    }
}