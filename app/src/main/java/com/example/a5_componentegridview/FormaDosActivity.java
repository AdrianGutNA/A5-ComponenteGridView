package com.example.a5_componentegridview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

public class FormaDosActivity extends Activity {

    private Button btnRegresar;
    GridView    datos;
    Context     context;

    public static String [] nombres ={  "Alejandro Hernandez Cochine",
                                        "Andres Garcia Gracia",
                                        "Adrian Gutiérrez Nava",
                                        "Cleto Gonzales Jaimes",
                                        "Tiburcio Arellano Estrada",
                                        "Alberto Nava Maximo",
                                        "Juan Torres Sales",
                                        "Ana Miranda Bonifacio"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formauno);

        btnRegresar =             findViewById(R.id.btnRegresar);

        context =   this;
        datos   =   (GridView) findViewById(R.id.lvForma1);
        datos.setAdapter(new AdaptadorFormaDos(this, nombres));

        btnRegresar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(FormaDosActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}