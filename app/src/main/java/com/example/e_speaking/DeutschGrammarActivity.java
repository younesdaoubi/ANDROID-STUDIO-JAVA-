package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class DeutschGrammarActivity extends AppCompatActivity {

    ArrayList<String> responsesList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deutsch_grammar);

        final TextView text_enonce = (TextView) findViewById(R.id.textView_enonce);
        String[] tabText = {"ich", "wir", "ist", "sind"};


        String text_enon = "vervollständigen mit : ";
        for(int i=0;i<tabText.length;i++) {
            text_enon += tabText[i]+"  ";
        }

        text_enonce.setText(text_enon);
    }

    public void sendMessageGramEn(View view){



        EditText tonEdit1 = findViewById(R.id.de_display_msg1);
        String text1 = tonEdit1.getText().toString();


        responsesList.add(text1);


        Intent intent = new Intent (this, DeutschGrammar2Activity.class);

        intent.putExtra("responsesList", responsesList);
        startActivity(intent);
    }

}
