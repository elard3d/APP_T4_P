package com.example.app_t4_p;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMostrarAnimes = findViewById(R.id.btnMostrarAnimes);
        Button btnCrearAnimes = findViewById(R.id.btnCrearAnime);

        btnCrearAnimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CrearAnimesActivity.class);
                startActivity(intent);
            }
        });

        btnMostrarAnimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MostrarAnimesActivity.class);
                startActivity(intent);
            }
        });


    }


}