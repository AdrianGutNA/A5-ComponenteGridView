package com.example.a5_componentegridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorFormaTres extends ArrayAdapter<ClaseFormaTres>
{

    public AdaptadorFormaTres(Context context, ArrayList<ClaseFormaTres> arrayList)
    {
        super(context, 0, arrayList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {

        View v = convertView;
        v = LayoutInflater.from(getContext()).inflate(R.layout.layout_formatres, parent, false);

        ClaseFormaTres datos = getItem(position);
        ImageView img = v.findViewById(R.id.imgView);
        assert datos != null;

        img.setImageResource(datos.getImagenId());

        TextView tvNombre = v.findViewById(R.id.txtNombre);
        tvNombre.setText(datos.getNombre());

        TextView tvApellido = v.findViewById(R.id.txtApellido);
        tvApellido.setText(datos.getApellidos());

        return v;
    }
}

