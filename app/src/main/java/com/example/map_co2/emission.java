package com.example.map_co2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class emission extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emission);

        Spinner vehicle = findViewById(R.id.transport);
        String[] items = new String[]{"2W(Two-Wheeler)", "3W(Three-Wheeler)", "4W(Four-Wheeler"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        vehicle.setAdapter(adapter);

        Spinner Fuel = findViewById(R.id.fuel);
        String[] item = new String[]{"Petrol", "Diesel"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, item);
        Fuel.setAdapter(adapter1);

        TextView distance = findViewById(R.id.dist);
        distance.setText(String.format("%.3fKm",dis);

    }
}