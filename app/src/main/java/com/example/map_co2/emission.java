package com.example.map_co2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationBarView;

public class emission extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

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

        Intent intent = getIntent();
        String str = intent.getStringExtra("msg_dis");

        TextView distance = findViewById(R.id.dist);
        distance.setText(str);




    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}