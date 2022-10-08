package com.example.a5_componentegridview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FormaTresActivity extends AppCompatActivity {

    private Button btnRegresar;
    private GridView lvNombres;
    private ArrayList<ClaseFormaTres> datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formauno);

        btnRegresar =             findViewById(R.id.btnRegresar);

        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        datos = new ArrayList<ClaseFormaTres>();
        datos.add(new ClaseFormaTres(R.drawable.alumno,"Alejandro","Hernandez Cochine"));
        datos.add(new ClaseFormaTres(R.drawable.alumno,"Andres","Garcia Gracia"));
        datos.add(new ClaseFormaTres(R.drawable.alumno,"Adrian","Gutiérrez Nava"));
        datos.add(new ClaseFormaTres(R.drawable.alumno,"Cleto","Gonzales Jaimes"));
        datos.add(new ClaseFormaTres(R.drawable.alumno,"Tiburcio","Arellano Estrada"));
        datos.add(new ClaseFormaTres(R.drawable.alumno,"Alberto","Nava Maximo"));
        datos.add(new ClaseFormaTres(R.drawable.alumno,"Juan","Torres Sales"));
        datos.add(new ClaseFormaTres(R.drawable.alumno,"Ana","Miranda Bonifacio"));

        AdaptadorFormaTres mi_adaptador=new AdaptadorFormaTres(this, datos);
        lvNombres= (GridView) findViewById(R.id.lvForma1);
        lvNombres.setAdapter(mi_adaptador);

        lvNombres.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                ClaseFormaTres datos = mi_adaptador.getItem(position);
                assert datos != null;

                Toast.makeText(FormaTresActivity.this, "Has pulsado: " + datos.getNombre() + " " + datos.getApellidos(), Toast.LENGTH_LONG).show();
            }
        });

        btnRegresar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(FormaTresActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}