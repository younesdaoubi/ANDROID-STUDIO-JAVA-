package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class DutchVocabularyAnimalFeedBackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dutch_vocabulary_animal_feed_back);

        String[] responses = {"leeuw", "giraffe","kat", "vis","zebra","hond","haai"};
        //correction de l'exercice
        ArrayList<String> responsesList = (ArrayList<String>) getIntent().getSerializableExtra("responsesDuAnimal");
        String [] responsesTab = new String[responsesList.size()];
        for(int i=0;i<responsesList.size();i++){
            responsesTab[i]=responsesList.get(i).toLowerCase();
        }
        String text ="";
        final TextView textView8 = (TextView) findViewById(R.id.TextViewDuAnimal8);
        final TextView textView1 = (TextView) findViewById(R.id.TextViewDuAnimal1);
        final TextView textView11 = (TextView) findViewById(R.id.TextViewDuAnimal11);
        final TextView textView2 = (TextView) findViewById(R.id.TextViewDuAnimal2);
        final TextView textView22 = (TextView) findViewById(R.id.TextViewDuFruit22);
        final TextView textView3 = (TextView) findViewById(R.id.TextViewDuAnimal3);
        final TextView textView33 = (TextView) findViewById(R.id.TextViewDuAnimal33);
        final TextView textView4 = (TextView) findViewById(R.id.TextViewDuAnimal4);
        final TextView textView44 = (TextView) findViewById(R.id.TextViewDuAnimal44);
        final TextView textView5 = (TextView) findViewById(R.id.TextViewDuAnimal5);
        final TextView textView55 = (TextView) findViewById(R.id.TextViewDuAnimal55);
        final TextView textView6 = (TextView) findViewById(R.id.TextViewDuAnimal6);
        final TextView textView66 = (TextView) findViewById(R.id.TextViewDuFruit66);
        final TextView textView7 = (TextView) findViewById(R.id.TextViewDuFruit7);
        final TextView textView77 = (TextView) findViewById(R.id.TextViewDuAnimal77);
        final TextView textViewDeFruitTitle = (TextView) findViewById(R.id.textViewDuAnimalTitle);
        //textViewDeFruitTitle.setBackgroundColor(Color.BLACK);//set background color

        // initialisation de count pour cote /10
        int count = 0;

        if(responsesTab[0].equals(responses[0]))
        {
            textView1.setBackgroundColor(Color.rgb(178,255, 102)); //v
            textView1.setText(responsesTab[0]);
            count++;
            textView11.setText(" +1");
            textView11.setBackgroundColor(Color.rgb(178,255, 102));
        }

        else if(responsesTab[0].equals("")){
            textView1.setBackgroundColor(Color.rgb(255,102, 102)); //r
            textView1.setText("non répondu");
            textView11.setBackgroundColor(Color.rgb(178,255, 102)); //v
            textView11.setText("-> "+responses[0]);
        }
        else
        {
            textView1.setBackgroundColor(Color.rgb(255,102, 102)); //r
            textView1.setText(responsesTab[0]);
            textView11.setBackgroundColor(Color.rgb(178,255, 102)); //v
            textView11.setText("-> "+responses[0]);
        }

        if(responsesTab[1].equals(responses[1])){
            textView2.setBackgroundColor(Color.rgb(178,255, 102)); //v
            textView2.setText(responsesTab[1]);
            count++;
            textView22.setText(" +1");
            textView22.setBackgroundColor(Color.rgb(178,255, 102));
        }
        else if(responsesTab[1].equals("")){
            textView2.setBackgroundColor(Color.rgb(255,102, 102)); //r
            textView2.setText("non répondu");
            textView22.setBackgroundColor(Color.rgb(178,255, 102)); //v
            textView22.setText("-> "+responses[1]);
        }
        else{
            textView2.setBackgroundColor(Color.rgb(255,102, 102)); //r
            textView2.setText(responsesTab[1]);
            textView22.setBackgroundColor(Color.rgb(178,255, 102)); //v
            textView22.setText("-> "+responses[1]);
        }

        if(responsesTab[2].equals(responses[2])){
            textView3.setBackgroundColor(Color.rgb(178,255, 102)); //v
            textView3.setText(responsesTab[2]);
            count++;
            textView33.setText(" +1");
            textView33.setBackgroundColor(Color.rgb(178,255, 102));
        }
        else if(responsesTab[2].equals("")){
            textView3.setBackgroundColor(Color.rgb(255,102, 102)); //r
            textView3.setText("non répondu");
            textView33.setBackgroundColor(Color.rgb(178,255, 102)); //v
            textView33.setText("-> "+responses[2]);
        }
        else{
            textView3.setBackgroundColor(Color.rgb(255,102, 102)); //r
            textView3.setText(responsesTab[2]);
            textView33.setBackgroundColor(Color.rgb(178,255, 102)); //v
            textView33.setText("-> "+responses[0]);
        }

        if(responsesTab[3].equals(responses[3])){
            textView4.setBackgroundColor(Color.rgb(178,255, 102)); //v
            textView4.setText(responsesTab[3]);
            count++;
            textView44.setText(" +1");
            textView44.setBackgroundColor(Color.rgb(178,255, 102));
        }
        else if(responsesTab[3].equals("")){
            textView4.setBackgroundColor(Color.rgb(255,102, 102)); //r
            textView4.setText("non répondu");
            textView44.setBackgroundColor(Color.rgb(178,255, 102)); //v
            textView44.setText("-> "+responses[3]);
        }
        else{
            textView4.setBackgroundColor(Color.rgb(255,102, 102)); //r
            textView4.setText(responsesTab[3]);
            textView44.setBackgroundColor(Color.rgb(178,255, 102)); //v
            textView44.setText("-> "+responses[3]);
        }

        if(responsesTab[4].equals(responses[4])){
            textView5.setBackgroundColor(Color.rgb(178,255, 102)); //v
            textView5.setText(responsesTab[4]);
            count++;
            textView55.setText(" +1");
            textView55.setBackgroundColor(Color.rgb(178,255, 102));
        }
        else if(responsesTab[4].equals("")){
            textView5.setBackgroundColor(Color.rgb(255,102, 102)); //r
            textView5.setText("non répondu");
            textView55.setBackgroundColor(Color.rgb(178,255, 102)); //v
            textView55.setText("-> "+responses[4]);
        }
        else{
            textView4.setBackgroundColor(Color.rgb(255,102, 102)); //r
            textView4.setText(responsesTab[4]);
            textView44.setBackgroundColor(Color.rgb(178,255, 102)); //v
            textView44.setText("-> "+responses[4]);
        }

        if(responsesTab[5].equals(responses[5])){
            textView6.setBackgroundColor(Color.rgb(178,255, 102)); //v
            textView6.setText(responsesTab[5]);
            count++;
            textView66.setText(" +1");
            textView66.setBackgroundColor(Color.rgb(178,255, 102));
        }
        else if(responsesTab[5].equals("")){
            textView6.setBackgroundColor(Color.rgb(255,102, 102)); //r
            textView6.setText("non répondu");
            textView66.setBackgroundColor(Color.rgb(178,255, 102)); //v
            textView66.setText("-> "+responses[5]);
        }
        else
        {
            textView6.setBackgroundColor(Color.rgb(255,102, 102)); //r
            textView6.setText(responsesTab[5]);
            textView66.setBackgroundColor(Color.rgb(178,255, 102)); //v
            textView66.setText("-> "+responses[5]);
        }

        if(responsesTab[6].equals(responses[6])){
            textView7.setBackgroundColor(Color.rgb(178,255, 102)); //v
            textView7.setText(responsesTab[6]);
            count++;
            textView77.setText(" +1");
            textView77.setBackgroundColor(Color.rgb(178,255, 102));
        }
        else if(responsesTab[6].equals("")){
            textView7.setBackgroundColor(Color.rgb(255,102, 102)); //r
            textView7.setText("non répondu");
            textView77.setBackgroundColor(Color.rgb(178,255, 102)); //v
            textView77.setText("-> "+responses[6]);
        }
        else{
            textView7.setBackgroundColor(Color.rgb(255,102, 102)); //r
            textView7.setText(responsesTab[6]);
            textView77.setBackgroundColor(Color.rgb(178,255, 102)); //v
            textView77.setText("-> "+responses[6]);
        }

        // comme on a 7 questions et qu'il faut convertir ca sur /10
        DecimalFormat df = new DecimalFormat("#.#");
        double countt = count;
        countt = (countt/7)*10;

        if(countt>=5){
            textView8.setBackgroundColor(Color.rgb(178,255, 102));
            textView8.setText(df.format(countt)+"/10"+"  ");
        }
        else
        {
            textView8.setBackgroundColor(Color.rgb(255,102, 102));
            textView8.setText(df.format(countt)+"/10");
        }


    /*// verification reponses note sur /10.
    int count = 0;
    String a,b;
        for(int i=0;i<correction.length;i++){
        a=responsesTab[i];
        b=correction[i];
        if(a.equals(b)){
            count++;
        }
    }

    //count = (count/7)*10;
        textView1.setText(String.valueOf(count));*/
    }


    public void openDutchMenu(View view){

        startActivity(new Intent(this,DutchMenu.class));
    }

    public void openDutchex(View view){

        startActivity(new Intent(this,DutchVocabularyMenuActivity.class));
    }
}
