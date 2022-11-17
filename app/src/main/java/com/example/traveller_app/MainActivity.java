package com.example.traveller_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button Museums;
    private Button Hotels;
    private Button Banks;
    private Button Caffe;
    private Button Photos;
    private Button Restaurants;
    private Button Sights;
    private Button General_Informations;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Museums=findViewById(R.id.button);
        Hotels =findViewById(R.id.button2);
        Banks=findViewById(R.id.button3);
        Caffe=findViewById(R.id.button4);
        Photos=findViewById(R.id.button5);
        Restaurants=findViewById(R.id.button6);
        Sights=findViewById(R.id.button7);
        General_Informations=findViewById(R.id.button8);


        Sights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent New_Screen=new Intent(getApplicationContext(),SightsActivity.class);
                startActivity(New_Screen);
            }
        });

    }
}