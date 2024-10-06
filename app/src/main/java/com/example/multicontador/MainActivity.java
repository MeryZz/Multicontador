package com.example.multicontador;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Las variables para los contadores
    private int contadorGlobal = 0;
    private int contador1 = 0;
    private int contador2 = 0;
    private int contador3 = 0;
    private int contador4 = 0;

    //TextViews para mostrar los contadores
    private TextView contadorGlobalTextView, contador1TextView, contador2TextView, contador3TextView, contador4TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Enlazar los TextViews con los IDs del layout
        contadorGlobalTextView = findViewById(R.id.contadorGlobal);
        contador1TextView = findViewById(R.id.contador1);
        contador2TextView = findViewById(R.id.contador2);
        contador3TextView = findViewById(R.id.contador3);
        contador4TextView = findViewById(R.id.contador4);

        //Enlazar los botones de cada contador con los IDs del layout
        Button botonIncrementar1 = findViewById(R.id.botonIncrementar1);
        Button botonReset1 = findViewById(R.id.botonReset1);
        Button botonIncrementar2 = findViewById(R.id.botonIncrementar2);
        Button botonReset2 = findViewById(R.id.botonReset2);
        Button botonIncrementar3 = findViewById(R.id.botonIncrementar3);
        Button botonReset3 = findViewById(R.id.botonReset3);
        Button botonIncrementar4 = findViewById(R.id.botonIncrementar4);
        Button botonReset4 = findViewById(R.id.botonReset4);

        //Enlazar el botón de Reset Global con el del layout
        Button botonResetGlobal = findViewById(R.id.botonResetGlobal);

        //Incrementar y resetear cada contador
        botonIncrementar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador1++;
                actualizarContador(1);
            }
        });

        botonReset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador1 = 0;
                actualizarContador(1);
            }
        });

        botonIncrementar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador2++;
                actualizarContador(2);
            }
        });

        botonReset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador2 = 0;
                actualizarContador(2);
            }
        });

        botonIncrementar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador3++;
                actualizarContador(3);
            }
        });

        botonReset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador3 = 0;
                actualizarContador(3);
            }
        });

        botonIncrementar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador4++;
                actualizarContador(4);
            }
        });

        botonReset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador4 = 0;
                actualizarContador(4);
            }
        });

        //Reiniciar todos los contadores
        botonResetGlobal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador1 = 0;
                contador2 = 0;
                contador3 = 0;
                contador4 = 0;
                contadorGlobal = 0;
                actualizarTodosLosContadores();
            }
        });
    }

    //Método para actualizar un contador específico y el global
    private void actualizarContador(int contador) {
        switch (contador) {
            case 1:
                contador1TextView.setText(String.valueOf(contador1));
                break;
            case 2:
                contador2TextView.setText(String.valueOf(contador2));
                break;
            case 3:
                contador3TextView.setText(String.valueOf(contador3));
                break;
            case 4:
                contador4TextView.setText(String.valueOf(contador4));
                break;
        }
        //Actualizar el contador global
        contadorGlobal = contador1 + contador2 + contador3 + contador4;
        contadorGlobalTextView.setText(String.valueOf(contadorGlobal));
    }

    //Método para actualizar todos los contadores
    private void actualizarTodosLosContadores() {
        contador1TextView.setText(String.valueOf(contador1));
        contador2TextView.setText(String.valueOf(contador2));
        contador3TextView.setText(String.valueOf(contador3));
        contador4TextView.setText(String.valueOf(contador4));
        contadorGlobalTextView.setText(String.valueOf(contadorGlobal));
    }
}