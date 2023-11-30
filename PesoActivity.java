package com.example.testpi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class PesoActivity extends AppCompatActivity {
    Spinner spinnerPeso;
    EditText valorPeso;
    Button btnCalcularPeso;
    TextView resultadoPeso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso);

        Spinner spinnerPeso = findViewById(R.id.spinnerPESO);
        EditText valorPeso  = findViewById(R.id.valorPeso);
        Button btnCalcular = findViewById(R.id.btnCalcularPeso);
        TextView resultadoPeso = findViewById(R.id.resultadoPeso);


        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String paisSeleccionado = spinnerPeso.getSelectedItem().toString();
                double valor = Double.parseDouble(valorPeso.getText().toString());
                if (paisSeleccionado.equals("Kilogramos->Libras")) {
                    peso peso = new peso("Kilogramos", "Libras");
                    resultadoPeso.setText(String.valueOf(peso.convertir(valor)));
                }
                if (paisSeleccionado.equals("Libras->Kilogramos")) {
                    peso peso = new peso("Libras", "Kilogramos");
                    resultadoPeso.setText(String.valueOf(peso.convertir(valor)));


                }
                if (paisSeleccionado.equals("Gramos->Libras")) {
                    peso peso = new peso("Gramos", "Libras");
                    resultadoPeso.setText(String.valueOf(peso.convertir(valor)));
                }
                if (paisSeleccionado.equals("Libras->Gramos")) {
                    peso peso = new peso("Libras", "Gramos");
                    resultadoPeso.setText(String.valueOf(peso.convertir(valor)));
                }
                if (paisSeleccionado.equals("Kilogramos->Gramos")) {
                    peso peso = new peso("Kilogramos", "Gramos");
                    resultadoPeso.setText(String.valueOf(peso.convertir(valor)));
                }
                if (paisSeleccionado.equals("Gramos->Kilogramos")) {
                    peso peso = new peso("Gramos", "Kilogramos");
                    resultadoPeso.setText(String.valueOf(peso.convertir(valor)));
                }
                if (paisSeleccionado.equals("Libras->Onzas")) {
                    peso peso = new peso("Libras", "Onzas");
                    resultadoPeso.setText(String.valueOf(peso.convertir(valor)));
                }
                if (paisSeleccionado.equals("Onzas->Libras")) {
                    peso peso = new peso("Onzas", "Libras");
                    resultadoPeso.setText(String.valueOf(peso.convertir(valor)));
                }
                if (paisSeleccionado.equals("Gramos->Onzas")) {
                    peso peso = new peso("Gramos", "Onzas");
                    resultadoPeso.setText(String.valueOf(peso.convertir(valor)));
                }
                if (paisSeleccionado.equals("Onzas->Gramos")) {
                    peso peso = new peso("Onzas", "Gramos");
                    resultadoPeso.setText(String.valueOf(peso.convertir(valor)));
                }
                if (paisSeleccionado.equals("Toneladas->Libras")) {
                    peso peso = new peso("Toneladas", "Libras");
                    resultadoPeso.setText(String.valueOf(peso.convertir(valor)));
                }
                if (paisSeleccionado.equals("Libras->Toneladas")) {
                    peso peso = new peso("Libras", "Toneladas");
                    resultadoPeso.setText(String.valueOf(peso.convertir(valor)));
                }
                if (paisSeleccionado.equals("Toneladas->Gramos")) {
                    peso peso = new peso("Toneladas", "Gramos");
                    resultadoPeso.setText(String.valueOf(peso.convertir(valor)));
                }
                if (paisSeleccionado.equals("Gramos->Toneladas")) {
                    peso peso = new peso("Gramos", "Toneladas");
                    resultadoPeso.setText(String.valueOf(peso.convertir(valor)));
                }
                if (paisSeleccionado.equals("Gramos->Toneladas")) {
                    peso peso = new peso("Gramos", "Toneladas");
                    resultadoPeso.setText(String.valueOf(peso.convertir(valor)));
                }

                if (paisSeleccionado.equals("Toneladas->Miligramos")) {
                    peso peso = new peso("Toneladas", "Miligramos");
                    resultadoPeso.setText(String.valueOf(peso.convertir(valor)));
                }
                if (paisSeleccionado.equals("Miligramos->Toneladas")) {
                    peso peso = new peso("Miligramos", "Toneladas");
                    resultadoPeso.setText(String.valueOf(peso.convertir(valor)));
                }
                if (paisSeleccionado.equals("Miligramos->Kilogramos")) {
                    peso peso = new peso("Miligramos", "Kilogramos");
                    resultadoPeso.setText(String.valueOf(peso.convertir(valor)));
                }
                if (paisSeleccionado.equals("Kilogramos->Miligramos")) {
                    peso peso = new peso("Kilogramos", "Miligramos");
                    resultadoPeso.setText(String.valueOf(peso.convertir(valor)));
                }
            }
        });
    }
}
