/*
    Courtesy of Silvan Rechsteiner. Excellent idea of creating a helper class for calculations with a spinner. 
*/
package com.example.bicycleconfigurator;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Locale;

class Calculator {

    private float price;

    private Activity activity;
    private TextView textViewPrice;
    private Spinner spinner;

    Calculator(final Activity activity, final Spinner spinner) {
        this.activity = activity;
        this.textViewPrice = this.activity.findViewById(R.id.textViewTotal);
        this.spinner = spinner;
        this.setListenerForSpinner();
        this.updateThatDamnUI();
        this.initialPrice();
    }

    private void setListenerForSpinner() {
        this.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (spinner.getSelectedItem().toString()) {
                    case "Scott":
                        price = 1000f;
                        break;
                    case "Bianci":
                        price = 1200f;
                        break;
                    case "Trek":
                        price = 1500f;
                        break;
                }
                updateThatDamnUI();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    private void initialPrice() {
        this.updateThatDamnUI();
    }

    private void updateThatDamnUI() {
        textViewPrice.setText(String.format(Locale.getDefault(),
                this.activity.getString(R.string.string_format_price),
                this.price));
    }

    float getTotalPrice() {
        return this.price;
    }
}
