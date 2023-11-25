package com.example.testpi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class LongitudActivity extends AppCompatActivity {

    Spinner spinnerLongitud;
    EditText valorLongitud;
    Button btnCalcularLongitud;
    TextView resultadoLongitud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longitud);

        Spinner spinnerLongitud = findViewById(R.id.spinnerLongitud);
        EditText valorLongitud  = findViewById(R.id.valorLongitud);
        Button btnCalcular = findViewById(R.id.btncalcularLongitud);
        TextView resultadoLongitud = findViewById(R.id.resultadoLongitud);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String paisSeleccionado = spinnerLongitud.getSelectedItem().toString();
                double valor = Double.parseDouble(valorLongitud.getText().toString());
                if (paisSeleccionado.equals("Kilogramos->Libras")) {
                    longitud longitud = new longitud("Metros", "Pies");
                    resultadoLongitud.setText(String.valueOf(longitud.convertir(valor)));
                }
                if (paisSeleccionado.equals("Libras->Kilogramos")) {
                    longitud longitud = new longitud("Pies", "Metros");
                    resultadoLongitud.setText(String.valueOf(longitud.convertir(valor)));
                }
                if (paisSeleccionado.equals("Kilometros->Millas")) {
                    longitud longitud = new longitud("Kilometros", "Millas");
                    resultadoLongitud.setText(String.valueOf(longitud.convertir(valor)));
                }
                if (paisSeleccionado.equals("Millas->Kilogramos")) {
                    longitud longitud = new longitud("Millas", "Kilogramos");
                    resultadoLongitud.setText(String.valueOf(longitud.convertir(valor)));

                }
            }
        });
    }
}