package com.example.kappytraveller;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView idHello;
    private Button idButtonTown;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idButtonTown = findViewById(R.id.buttonTowns);
        idButtonTown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topTowns = new Intent(getApplicationContext(),TownsActivity.class);
                startActivity(topTowns);

            }
        });
    }
}