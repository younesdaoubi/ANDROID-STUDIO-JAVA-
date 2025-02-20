package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class DeutschGrammar6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deutsch_grammar6);

        final TextView text_enonce = (TextView) findViewById(R.id.textView_enonce);
        String[] tabText = {"ich", "wir", "ist", "sind"};


        String text_enon = "vervollständigen mit : ";
        for(int i=0;i<tabText.length;i++) {
            text_enon += tabText[i]+"  ";
        }

        text_enonce.setText(text_enon);
    }

    public void sendMessageGramEn(View view){


        ArrayList<String> responsesList = (ArrayList<String>) getIntent().getSerializableExtra("responsesList");
        EditText tonEdit1 = findViewById(R.id.de_display_msg6);
        String text1 = tonEdit1.getText().toString();


        responsesList.add(text1);


        Intent intent = new Intent (this, DeutschGrammar7Activity.class);

        intent.putExtra("responsesList", responsesList);
        startActivity(intent);
    }

}
