package com.example.e_speaking;

import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.e_speaking.databinding.ActivityMapsBinding;

import java.util.ArrayList;
import java.util.Vector;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
private ActivityMapsBinding binding;

    MarkerOptions marker;
    LatLng centerlocation;

    Vector<MarkerOptions> markerOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<String> latList =  (ArrayList<String>)getIntent().getSerializableExtra("latList");
        ArrayList<String> lngList =  (ArrayList<String>)getIntent().getSerializableExtra("lngList");
        ArrayList<String> nameList = (ArrayList<String>)getIntent().getSerializableExtra("nameList");

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
     setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        centerlocation = new LatLng(12,4);
        markerOptions = new Vector<>();

        String lat,lng="";
        for(int i=0;i<latList.size();i++){
            lat=latList.get(i);
            lng=lngList.get(i);
            markerOptions.add(new MarkerOptions().title("1")
                    .position(new LatLng(Double.parseDouble(lat), Double.parseDouble(lng)))
                    .snippet(nameList.get(i))
            );

        }
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        for(MarkerOptions mark : markerOptions){
            mMap.addMarker(mark);

        }
        //LatLng sydney = new LatLng(-34, 151);
        //mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(centerlocation, 0));
    }

}