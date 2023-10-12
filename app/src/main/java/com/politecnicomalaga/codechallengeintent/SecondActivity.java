package com.politecnicomalaga.codechallengeintent;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Llamamos al Intent dandole como valor getIntent
        Intent intent = getIntent();
        // Si hay contenido en TEXTO_EXTRA se almacena el texto en el TextView
        if (intent.hasExtra(MainActivity.TEXTO_EXTRA)) {
            String texto = intent.getStringExtra(MainActivity.TEXTO_EXTRA);
            TextView tvTexto = findViewById(R.id.tvTextoSA);
            tvTexto.setText(texto);
        }
    }
}