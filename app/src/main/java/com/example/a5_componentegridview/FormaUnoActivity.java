package com.example.a5_componentegridview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FormaUnoActivity extends AppCompatActivity
{
    private  Button             btnRegresar;
    private  GridView           gvForma1;
    private  ArrayList<String>  nombres;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formauno);

        gvForma1    = (GridView)  findViewById(R.id.lvForma1);
        btnRegresar =             findViewById(R.id.btnRegresar);

        nombres = new ArrayList<String>();
        nombres.add("Alejandro Hernandez Cochine");
        nombres.add("Andres Garcia Gracia");
        nombres.add("Adrian Gutiérrez Nava");
        nombres.add("Cleto Gonzales Jaimes");
        nombres.add("Tiburcio Arellano Estrada");
        nombres.add("Alberto Nava Maximo");
        nombres.add("Juan Torres Sales");
        nombres.add("Ana Miranda Bonifacio");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,nombres);
        gvForma1.setAdapter(adapter);

        gvForma1.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id)
            {
                Toast.makeText(FormaUnoActivity.this, "Has pulsado: "+ nombres.get(position), Toast.LENGTH_LONG).show();
            }
        });

        btnRegresar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(FormaUnoActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
