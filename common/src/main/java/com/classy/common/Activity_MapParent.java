package com.classy.common;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.gson.Gson;

public abstract class Activity_MapParent extends AppCompatActivity {

    protected String AD_MOB_BOTTOM_BANNER_ID = "";

    private TextView map_LBL_title;
    private TextView map_LBL_currentLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        map_LBL_title = findViewById(R.id.map_LBL_title);
        map_LBL_currentLocation = findViewById(R.id.map_LBL_currentLocation);

        map_LBL_currentLocation.setText("Givataim");
    }

    protected void setTitle(String title) {
        map_LBL_title.setText(title);
    }


}