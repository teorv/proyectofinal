package com.example.vengaamipueblo2.moldes;

public class MoldeSitio {
    String nombre;
    String telefono;
    String rangoPre;
    private int foto;


    public MoldeSitio() {
    }

    public MoldeSitio(String nombre, String telefono, String rangoPre, int foto) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.rangoPre = rangoPre;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRangoPre() {
        return rangoPre;
    }

    public void setRangoPre(String rangoPre) {
        this.rangoPre = rangoPre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
