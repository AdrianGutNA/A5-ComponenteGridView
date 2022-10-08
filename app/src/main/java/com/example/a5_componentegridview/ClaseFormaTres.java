package com.example.a5_componentegridview;

public class ClaseFormaTres
{
    private int imagenId;
    private String nombre;
    private String apellidos;

    public ClaseFormaTres() {}

    public ClaseFormaTres(int imagenId, String nombre, String apellidos)
    {
        this.imagenId = imagenId;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    public  int getImagenId()
    {
        return imagenId;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getApellidos()
    {
        return apellidos;
    }

}


