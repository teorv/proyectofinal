package com.example.vengaamipueblo2.moldes;

public class MoldeHotel {

    private String nombre;
    private String precio;
    private int foto;

    public MoldeHotel() {

    }
//estos son constructores
    public MoldeHotel(String nombre, String precio, int foto) {
        this.nombre = nombre;
        this.precio = precio;
        this.foto = foto;
    }
//
    public String getNombre() {
        return nombre;
    }
//traerlo
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
