package com.classy.cycling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.classy.common.Activity_MapParent;

public class Activity_Map extends Activity_MapParent {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AD_MOB_BOTTOM_BANNER_ID = Constants.AD_MOB_BOTTOM_BANNER_ID;

        super.onCreate(savedInstanceState);
    }
}