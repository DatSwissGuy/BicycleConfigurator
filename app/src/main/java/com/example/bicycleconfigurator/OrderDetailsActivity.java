package com.example.bicycleconfigurator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OrderDetailsActivity extends AppCompatActivity {

    private String bikeType;
    private float totalPrice;
    private String selectedColor;
    private String selectedManufacturer;
    private String selectedFramesize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);

        this.bikeType = getIntent().getStringExtra(getString(R.string.text_bike_type));
        this.totalPrice = getIntent().getFloatExtra(getString(R.string.text_price), 0);
        this.selectedColor = getIntent().getStringExtra(getString(R.string.text_bike_color));
        this.selectedManufacturer = getIntent().getStringExtra(getString(R.string.text_manufacturer));
        this.selectedFramesize = getIntent().getStringExtra(getString(R.string.text_bike_framesize));

        TextView textViewBikeType = findViewById(R.id.textBikeType);
        textViewBikeType.setText(this.bikeType);

        TextView textViewBikeManufacturer = findViewById(R.id.textBikeManufacturer);
        textViewBikeManufacturer.setText(this.selectedManufacturer);

        TextView textViewBikeColor = findViewById(R.id.textBikeColor);
        textViewBikeColor.setText(this.selectedColor);

        TextView textViewBikeFramesize = findViewById(R.id.textBikeFramesize);
        textViewBikeFramesize.setText(this.selectedFramesize);

        TextView textViewBikePrice = findViewById(R.id.textTotalPrice);
        textViewBikePrice.setText(String.format(getString(R.string.text_format_price), this.totalPrice));
    }

}
