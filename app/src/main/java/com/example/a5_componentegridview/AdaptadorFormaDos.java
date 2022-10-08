package com.example.a5_componentegridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AdaptadorFormaDos extends BaseAdapter
{

    String[]    nombres;
    Context     contexto;

    private static LayoutInflater inflater= null;

    public AdaptadorFormaDos(FormaDosActivity mainActivity, String[]ListaNombres) {
        nombres     = ListaNombres;
        contexto    = mainActivity;
        inflater    = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount()
    {
        return nombres.length;
    }
    @Override
    public  Object getItem(int posicion)
    {
        return posicion;
    }
    @Override
    public  long  getItemId(int posicion)
    {
        return posicion;
    }
    public class Holder
    {
        TextView tvNombres;
        TextView tvApellidos;
        ImageView img;
    }
    @Override
    public View getView(final int posicion, View convertView, ViewGroup parent)
    {
        View  v ;
        v = inflater.inflate(R.layout.layout_forma_dos, null);

        Holder  holder=new Holder();

        holder.tvNombres=(TextView) v.findViewById(R.id.txtNombre);
        holder.img=(ImageView) v.findViewById(R.id.imgView);

        holder.tvNombres.setText(nombres[posicion]);

        v.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(contexto, "Seleccionaste "+nombres[posicion],Toast.LENGTH_LONG).show();
            }
        });
        return v;
    }
}