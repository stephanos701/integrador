package com.example.testpi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class DivisaActivity extends AppCompatActivity {

    Spinner spinnerDivisa;
    EditText valorDivisa;
    Button btnCalcularDivisa;
    TextView resultadoDivisa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisa);


        Spinner spinnerDivisa = findViewById(R.id.spinnerDivisa);
        EditText valorDivisa = findViewById(R.id.valorDivisa);
        Button btnCalcular = findViewById(R.id.btncalcularDivisa);
        TextView resultadoDivisa = findViewById(R.id.resultadoDivisa);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String paisSeleccionado = spinnerDivisa.getSelectedItem().toString();
                double valor = Double.parseDouble(valorDivisa.getText().toString());
                if (paisSeleccionado.equals("Dolar->Euro")) {
                    Divisa Divisa = new Divisa("Dolar", "Euro");
                    resultadoDivisa.setText(String.valueOf(Divisa.convertir(valor)));
                }
                if (paisSeleccionado.equals("Euro->Dolar")) {
                    Divisa Divisa = new Divisa("Euro", "Dolar");
                    resultadoDivisa.setText(String.valueOf(Divisa.convertir(valor)));
                }
                if (paisSeleccionado.equals("Dolar->Peso colombiano")) {
                    Divisa Divisa = new Divisa("Dolar", "Peso colombiano");
                    resultadoDivisa.setText(String.valueOf(Divisa.convertir(valor)));
                }
                if (paisSeleccionado.equals("Peso colombiano->Dolar")) {
                    Divisa Divisa = new Divisa("Peso colombiano", "Dolar");
                    resultadoDivisa.setText(String.valueOf(Divisa.convertir(valor)));
                }
                if (paisSeleccionado.equals("Peso colombiano->Euro")) {
                    Divisa Divisa = new Divisa("Euro", "Peso colombiano");
                    resultadoDivisa.setText(String.valueOf(Divisa.convertir(valor)));
                }
            }

        });
    }
}

