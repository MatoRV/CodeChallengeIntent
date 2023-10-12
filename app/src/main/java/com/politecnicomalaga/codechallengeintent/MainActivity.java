package com.politecnicomalaga.codechallengeintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // La llave para el envio del intent a la segunda actividad
    public static final String TEXTO_EXTRA = "com.example.android.codechallengeintent.extra.TEXTO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // En este método creamos el Intent de esta actividad a la segunda actividad
    private void envioDeDatos(String textoSecondActivity) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(TEXTO_EXTRA,textoSecondActivity);
        startActivity(intent);
    }

    // Estos métodos son para enviar un texto dependiendo del botón que se pulse
    public void empezarPrimeraActividad(View view) {
        envioDeDatos(getResources().getString(R.string.button_1_message));
    }

    public void empezarSegundaActividad(View view) {
        envioDeDatos(getResources().getString(R.string.button_2_message));
    }

    public void empezarTerceraActividad(View view) {
        envioDeDatos(getResources().getString(R.string.button_3_message));
    }
}