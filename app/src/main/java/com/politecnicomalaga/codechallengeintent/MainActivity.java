package com.politecnicomalaga.codechallengeintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TEXTO_EXTRA = "com.example.android.codechallengeintent.extra.TEXTO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void envioDeDatos(String textoSecondActivity) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(TEXTO_EXTRA,textoSecondActivity);
        startActivity(intent);
    }

    public void empezarPrimeraActividad(View view) {
        envioDeDatos(String.valueOf(R.string.button_1_message));
    }

    public void empezarSegundaActividad(View view) {
        envioDeDatos(String.valueOf(R.string.button_2_message));
    }

    public void empezarTerceraActividad(View view) {
        envioDeDatos(String.valueOf(R.string.button_3_message));
    }
}