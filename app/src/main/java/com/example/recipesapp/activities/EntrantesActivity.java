package com.example.recipesapp.activities;


import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.recipesapp.R;
import com.example.recipesapp.RecetaAdapter;
import com.example.recipesapp.models.Receta;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class EntrantesActivity extends AppCompatActivity {

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrantes);


        List<Receta> recetas = new ArrayList<>();
        recetas.add(new Receta("Bruschetta", "Pan tostado con tomate y albahaca", R.drawable.bruschetta));
        recetas.add(new Receta("Ensalada César", "Ensalada con pollo, lechuga y parmesano", R.drawable.ensalada_cesar));
        recetas.add(new Receta("Gazpacho", "Sopa fría de tomate y verduras", R.drawable.gazpacho));


        ListView listView = findViewById(R.id.list_recetas);
        RecetaAdapter adapter = new RecetaAdapter(this, recetas);
        listView.setAdapter(adapter);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.action_back) {
                // Volver a la actividad anterior
                onBackPressed();
                return true;
            } else if (item.getItemId() == R.id.action_about) {
                // Mostrar un diálogo de "Acerca de"
                showAboutDialog();
                return true;
            }
            return false;
        });

    }

    private void showAboutDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Acerca de")
                .setMessage("Esta actividad muestra recetas de entrantes. Haz clic en una receta para más detalles.")
                .setPositiveButton("OK", (dialog, which) -> dialog.dismiss())
                .show();
    }
}
