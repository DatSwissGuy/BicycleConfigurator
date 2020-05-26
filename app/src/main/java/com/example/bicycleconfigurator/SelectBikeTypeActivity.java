package com.example.bicycleconfigurator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelectBikeTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_bike_type);
    }

    public void switchToMountainBike(View view) {
        Intent intent = new Intent(this, MountainBikeOrderActivity.class);
        startActivity(intent);
    }

    public void switchToRaceBike(View view) {
        Intent intent = new Intent(this, RaceBikeOrderActivity.class);
        startActivity(intent);
    }
}
