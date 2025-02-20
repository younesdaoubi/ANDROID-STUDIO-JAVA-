package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class DutchGrammarActivity extends AppCompatActivity {

    ArrayList<String> responsesList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dutch_grammar);

        final TextView text_enonce = (TextView) findViewById(R.id.textView_enonce);
        String[] tabText = {"ben", "hebben", "is", "zijn"};

        String text_enon = "compleet met: ";
        for(int i=0;i<tabText.length;i++) {
            text_enon += tabText[i]+"  ";
        }

        text_enonce.setText(text_enon);
    }

    public void sendMessageGramEn(View view){

        // solutions possibles


        EditText tonEdit1 = findViewById(R.id.du_display_msg1);
        String text1 = tonEdit1.getText().toString();


        responsesList.add(text1);


        Intent intent = new Intent (this, DutchGrammar2Activity.class);

        intent.putExtra("responsesList", responsesList);
        startActivity(intent);
    }

}
