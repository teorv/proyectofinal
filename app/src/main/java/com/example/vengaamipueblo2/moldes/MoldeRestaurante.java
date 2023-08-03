package com.example.vengaamipueblo2.moldes;

public class MoldeRestaurante {
    static String nombre;
    static String descripcion;
    static String rangoPrecio;
    private static int foto;
    //clik derecho,dar Generate, y luego selecciono select None
    public MoldeRestaurante() {

    }

    //clik derecho,dar Generate, y luego selecciono todos los cambio y doy OK;  hay que crear un construtores tanto vacio (como esta el de arriba o lleno como esta este acontinuacion
    public MoldeRestaurante(String nombre, String descripcion, String rangoPrecio, int foto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.rangoPrecio = rangoPrecio;
        this.foto = foto;
    }
//Getter and getter
    public  String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public  String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public  String getRangoPrecio() {
        return rangoPrecio;
    }

    public void setRangoPrecio(String rangoPrecio) {
        this.rangoPrecio = rangoPrecio;
    }

    public  int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
