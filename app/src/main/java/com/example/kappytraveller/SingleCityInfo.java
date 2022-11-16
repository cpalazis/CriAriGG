package com.example.kappytraveller;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class SingleCityInfo extends AppCompatActivity {
    private TextView idRandom;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_city_info);
        idRandom = findViewById(R.id.random);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle okk = getIntent().getExtras();
        if(okk != null){
            idRandom.setText(okk.getString("cityId"));
        }
    }
}