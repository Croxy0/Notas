package com.example.notas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.DecimalFormat;

public class PromedioActivity extends AppCompatActivity {
    private EditText etN1;
    private EditText etN2;
    private EditText etN3;
    private TextView etProm;
    private TextView etEstado;
    private EditText etNombre;
    private EditText etApellido;
    ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promedio);

        etN1 = findViewById(R.id.etN1);
        etN2 = findViewById(R.id.etN2);
        etN3 = findViewById(R.id.etN3);
        etProm = findViewById(R.id.etProm);
        etEstado = findViewById(R.id.etEstado);
        etNombre = findViewById(R.id.etNombre);
        etApellido = findViewById(R.id.etApellido);

        TextView tvTitulo = findViewById(R.id.tvTitulo);
        tvTitulo.setText("Calculadora de Promedio");

        Button btnCalcular = findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(etN1.getText().toString());
                double n2 = Double.parseDouble(etN2.getText().toString());
                double n3 = Double.parseDouble(etN3.getText().toString());

                double promedio = (n1 + n2 + n3) / 3.0;

                DecimalFormat decimalFormat = new DecimalFormat("#.#");
                String promedioString = decimalFormat.format(promedio);

                etProm.setText("Promedio: " + promedioString);

                String estado;
                if (promedio >= 4.0) {
                    estado = "Aprobado";
                } else {
                    estado = "Reprobado";
                }

                etEstado.setText("Estado: " + estado);
            }
        });
    }
}
