package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class FrancaisGrammar5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_francais_grammar5);

        final TextView text_enonce = (TextView) findViewById(R.id.textView_enonce);
        String[] tabText =  {"suis", "avons", "est", "sont"};

        String text_enon = "Complete with : ";
        for (int i = 0; i < tabText.length; i++) {
            text_enon += tabText[i] + "  ";
        }

        text_enonce.setText(text_enon);
    }


    public void sendMessageGramEn(View view){

        ArrayList<String> responsesList = (ArrayList<String>) getIntent().getSerializableExtra("responsesList");

        EditText tonEdit5 = findViewById(R.id.fr_display_msg5);
        String text5 = tonEdit5.getText().toString();

        responsesList.add(text5);




        Intent intent = new Intent (this, FrancaisGrammar6Activity.class);
        intent.putExtra("responsesList", responsesList);
        startActivity(intent);
    }
}