package com.example.e_speaking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class EnglishMenu extends AppCompatActivity {


    ArrayList<String> latList = new ArrayList<String>(); // Create an ArrayList object
    ArrayList<String> lngList = new ArrayList<String>(); // Create an ArrayList object
    ArrayList<String> nameList = new ArrayList<String>(); // Create an ArrayList object

    CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_menu);


        cardView = (CardView) findViewById(R.id.buttonMapEnglish);
        Intent intent = new Intent();
        intent.setClass(getApplicationContext(),MapsActivity.class);

        RequestQueue queue=null;
        // RequestQueue queue = Volley.newRequestQueue(this);

        String url = "https://countries.craftypixels.com/v2/lang/en" +
                "";
        queue = Volley.newRequestQueue(this);
// Request a string response from the provided URL.
        StringRequest request = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try {
                            JSONArray jsonArray = new JSONArray(response);
                            String tempLat="";
                            String tempLng="";
                            String nameCountry="";

                            int count =0;//pour ne pas afficher la derniere virgule.
                            for(int i=0;i<jsonArray.length();i++){
                                count++;
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                tempLat=jsonObject.getJSONArray("latlng").getString(0);
                                latList.add(tempLat);
                                tempLng=jsonObject.getJSONArray("latlng").getString(1);
                                lngList.add(tempLng);
                                // j'ajoute également le nom de chaque pays dans nameList afin de réutiliser ces noms sur mes marqueurs dans la map.                                nameList.add(jsonObject.getString("name"));

                                nameCountry=jsonObject.getString("name");
                                nameList.add(nameCountry);
                            }

                            intent.putExtra("latList", latList);
                            intent.putExtra("lngList", lngList);
                            intent.putExtra("nameList", nameList);


                        }catch (Exception e ){
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("error",error.toString());
            }

        });

// Add the request to the RequestQueue.
        //queue.add(stringRequest);
        queue.add(request);



        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(intent);
            }
        });
    }

    public void openEnglishListening(View view){

        startActivity(new Intent(this,EnglishListeningMenuActivity.class));
    }

    public void openEnglishGrammar(View view){

        startActivity(new Intent(this,EnglishGrammarMenuActivity.class));
    }

    public void openEnglishVocabulary(View view){

        startActivity(new Intent(this,EnglishVocabularyMenuActivity.class));
    }

}

