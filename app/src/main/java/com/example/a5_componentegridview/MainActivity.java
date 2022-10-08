package com.example.a5_componentegridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnFormaUno;
    private Button btnFormaDos;
    private Button btnFormaTres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFormaUno = findViewById(R.id.btnForma1);
        btnFormaDos = findViewById(R.id.btnForma2);
        btnFormaTres = findViewById(R.id.btnForrma3);

        btnFormaUno.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, FormaUnoActivity.class);
                startActivity(a);
            }
        });

        btnFormaDos.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(MainActivity.this, FormaDosActivity.class);
                startActivity(b);
            }
        });

        btnFormaTres.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(MainActivity.this, FormaTresActivity.class);
                startActivity(b);
            }
        });
    }
}