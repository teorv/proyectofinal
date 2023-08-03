package com.example.vengaamipueblo2.adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vengaamipueblo2.R;
import com.example.vengaamipueblo2.moldes.MoldeSitio;

import java.util.ArrayList;

//viewHolder mantener una vista
public class SitioAdaptador extends RecyclerView.Adapter<SitioAdaptador.viewHolder> {
    //dar click en el bombillito seleccionar el primero y luego dar clic a las 3 herencias

    //Atributos //ArrayLista: la lista //nombre
    public ArrayList<MoldeSitio> listaSitios;

    //Constructor
    public SitioAdaptador(ArrayList<MoldeSitio> listaSitios) {
        this.listaSitios = listaSitios;
    }



    @NonNull //estas son anotaciones
    @Override //estas son anotaciones
    //onCreate disparar
    //Asociar y pintar
    public SitioAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       //null es vacio    (i es una interacion)
        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.moldesitio,null, false);
        return new viewHolder(vista);
    }
    //para identificar las lista que voy a pintar
    @Override
    public void onBindViewHolder(@NonNull SitioAdaptador.viewHolder viewHolder, int i) {
        //get: obtener
        viewHolder.actualizarDatos(listaSitios.get(i));

    }
    @Override
    //getItemCount: obtener la cantidad de elementos
    public int getItemCount() {
        return listaSitios.size();
    }
    //luego vamos de nuevo al bombillito y seleccionamos la primera y se crea la clase y de nuevo vamos al bombillo y damos a la extension

    //Asociar los elementos del model
    public class viewHolder extends RecyclerView.ViewHolder {
        TextView nombreSitio;
        TextView telefonoSitio;
        TextView precioSitio;
        ImageView fotoSitio;

        public viewHolder(View item){
            super(item);//findViewById sirve para buscar

            nombreSitio=item.findViewById(R.id.tito);
            telefonoSitio=item.findViewById(R.id.tel);
            precioSitio=item.findViewById(R.id.precio);
            fotoSitio=item.findViewById(R.id.ft1);

        }

        public void actualizarDatos(MoldeSitio moldeSitio) {
            nombreSitio.setText(moldeSitio.getNombre());
            telefonoSitio.setText(moldeSitio.getTelefono());
            precioSitio.setText(moldeSitio.getRangoPre());
            fotoSitio.setImageResource(moldeSitio.getFoto());

        }
    }
}
