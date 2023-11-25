package com.example.testpi;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnTemperatura;
    Button btnPeso;

    Button btnLongitud;

    Button btnDivisa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnTemperatura = findViewById(R.id.btnCalcularTemperatura);
        Button btnPeso= findViewById(R.id.btnCalcularPeso);
        Button btnLongitud= findViewById(R.id.btncalcularLongitud);
        Button btnDivisa= findViewById(R.id.btncalcularDivisa);
        btnTemperatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TemperaturaActivity.class);
                startActivity(intent);
            }
        });

        btnPeso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PesoActivity.class);
                startActivity(intent);
            }
        });
        btnLongitud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LongitudActivity.class);
                startActivity(intent);
            }
        });
        btnDivisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DivisaActivity.class);
                startActivity(intent);
            }
        });



    }
}