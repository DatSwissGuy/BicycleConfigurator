package com.example.bicycleconfigurator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class MountainBikeOrderActivity extends AppCompatActivity {

    private Spinner spinnerManufacturer;
    private Spinner spinnerColor;
    private Spinner spinnerFrameSize;
    private Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountain_bike_order);

        this.spinnerManufacturer = findViewById(R.id.spinnerManufacturer);
        ArrayAdapter spinnerEntriesManufacturer = ArrayAdapter.createFromResource(this, R.array.bike_manufacturer,
                android.R.layout.simple_spinner_item);
        this.spinnerManufacturer.setAdapter(spinnerEntriesManufacturer);

        this.spinnerColor = findViewById(R.id.spinnerColor);
        ArrayAdapter spinnerEntriesColor = ArrayAdapter.createFromResource(this, R.array.bike_color,
                android.R.layout.simple_spinner_item);
        this.spinnerColor.setAdapter(spinnerEntriesColor);

        this.spinnerFrameSize = findViewById(R.id.spinnerFrameSize);
        ArrayAdapter spinnerEntriesFramesize = ArrayAdapter.createFromResource(this, R.array.frame_height,
                android.R.layout.simple_spinner_item);
        this.spinnerFrameSize.setAdapter(spinnerEntriesFramesize);

        this.calculator = new Calculator(this, this.spinnerManufacturer);
    }
}
