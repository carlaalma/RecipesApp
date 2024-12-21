package com.example.recipesapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.recipesapp.activities.EntrantesActivity;

public class MainActivity extends AppCompatActivity {

        @SuppressLint("MissingInflatedId")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_main);
            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });

            Button btn_entrante = findViewById(R.id.btn_entrante);
            Button btn_principal = findViewById(R.id.btn_principal);
            Button btn_segundos = findViewById(R.id.btn_segundos);
            Button btn_postres = findViewById(R.id.btn_postres);
            Button btn_reposteria = findViewById(R.id.btn_reposteria);
            Button btn_panaderia = findViewById(R.id.btn_panadería);

            // Al hacer clic en el botón 'Entrantes'
            btn_entrante.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, EntrantesActivity.class);
                startActivity(intent); // Aquí se inicia la actividad
            });
        }
    }

