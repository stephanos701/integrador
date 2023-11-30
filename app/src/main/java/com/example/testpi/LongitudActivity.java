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
                if (paisSeleccionado.equals("Metros->Pies")) {
                    longitud longitud = new longitud("Metros", "Pies");
                    resultadoLongitud.setText(String.valueOf(longitud.convertir(valor)));
                }
                if (paisSeleccionado.equals("Pies->Metros")) {
                    longitud longitud = new longitud("Pies", "Metros");
                    resultadoLongitud.setText(String.valueOf(longitud.convertir(valor)));
                }
                if (paisSeleccionado.equals("Kilómetros->Millas")) {
                    longitud longitud = new longitud("Kilometros", "Millas");
                    resultadoLongitud.setText(String.valueOf(longitud.convertir(valor)));
                }
                if (paisSeleccionado.equals("Millas->Kilómetros")) {
                    longitud longitud = new longitud("Millas", "Kilogramos");
                    resultadoLongitud.setText(String.valueOf(longitud.convertir(valor)));

                }
                if (paisSeleccionado.equals("Centímetros->Pulgadas")) {
                    longitud longitud = new longitud("Centímetros", "Pulgadas");
                    resultadoLongitud.setText(String.valueOf(longitud.convertir(valor)));
                }
                if (paisSeleccionado.equals("Centímetros->Pulgadas")) {
                    longitud longitud = new longitud("Pulgadas", "Centímetros");
                    resultadoLongitud.setText(String.valueOf(longitud.convertir(valor)));
                }
                if (paisSeleccionado.equals("Yardas->Metros")) {
                    longitud longitud = new longitud("Yardas", "Metros");
                    resultadoLongitud.setText(String.valueOf(longitud.convertir(valor)));
                }
                if (paisSeleccionado.equals("Metros->Yardas")) {
                    longitud longitud = new longitud("Metros", "Yardas");
                    resultadoLongitud.setText(String.valueOf(longitud.convertir(valor)));

                }

                if (paisSeleccionado.equals("Millas Náuticas->Kilómetros")) {
                    longitud longitud = new longitud("Libras", "Kilogramos");
                    resultadoLongitud.setText(String.valueOf(longitud.convertir(valor)));
                }
                if (paisSeleccionado.equals("Micrómetros->Milímetros")) {
                    longitud longitud = new longitud("Micrómetros", "Milímetros");
                    resultadoLongitud.setText(String.valueOf(longitud.convertir(valor)));
                }
                if (paisSeleccionado.equals("Milímetros->Micrómetros")) {
                    longitud longitud = new longitud("Millas", "Kilómetros");
                    resultadoLongitud.setText(String.valueOf(longitud.convertir(valor)));

                }
                if (paisSeleccionado.equals("Milímetros->Micrómetros")) {
                    longitud longitud = new longitud("Kilogramos", "Libras");
                    resultadoLongitud.setText(String.valueOf(longitud.convertir(valor)));
                }
                if (paisSeleccionado.equals("Decímetros->Metros")) {
                    longitud longitud = new longitud("Decímetros", "Metros");
                    resultadoLongitud.setText(String.valueOf(longitud.convertir(valor)));
                }
                if (paisSeleccionado.equals("Metros->Decímetros")) {
                    longitud longitud = new longitud("Metros", "Decímetros");
                    resultadoLongitud.setText(String.valueOf(longitud.convertir(valor)));
                }

            }
        });
    }
}