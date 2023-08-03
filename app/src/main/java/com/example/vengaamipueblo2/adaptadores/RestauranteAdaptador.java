package com.example.vengaamipueblo2.adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vengaamipueblo2.R;
import com.example.vengaamipueblo2.moldes.MoldeRestaurante;
import com.example.vengaamipueblo2.moldes.MoldeRestaurante;

import java.util.ArrayList;

//viewHolder mantener una vista
public class RestauranteAdaptador extends RecyclerView.Adapter<RestauranteAdaptador.viewHolder> {
    //dar click en el bombillito seleccionar el primero y luego dar clic a las 3 herencias

    //Atributos //ArrayLista: la lista //nombre
    public ArrayList<MoldeRestaurante> listaRestaurante;

    //Constructor
    public RestauranteAdaptador(ArrayList<MoldeRestaurante> listaRestaurante) {
        this.listaRestaurante = listaRestaurante;
    }



    @NonNull //estas son anotaciones
    @Override //estas son anotaciones
    //onCreate disparar
    //Asociar y pintar
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       //null es vacio    (i es una interacion)
        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.modelrestaurante,null, false);
        return new viewHolder(vista);
    }
    //para identificar las lista que voy a pintar
    @Override
    public void onBindViewHolder(@NonNull RestauranteAdaptador.viewHolder viewHolder, int i) {
        //get: obtener
        viewHolder.actualizarDatos(listaRestaurante.get(i));

    }
    @Override
    //getItemCount: obtener la cantidad de elementos
    public int getItemCount() {
        return listaRestaurante.size();
    }
    //luego vamos de nuevo al bombillito y seleccionamos la primera y se crea la clase y de nuevo vamos al bombillo y damos a la extension

    //Asociar los elementos del model
    public class viewHolder extends RecyclerView.ViewHolder {
        TextView nombreRestaurante;
        TextView descripcionRestaurante;
        TextView rangoPrecioRestaurante;
        ImageView fotoRestaurante;

        public viewHolder(View item){
            super(item);//findViewById sirve para buscar
            nombreRestaurante=item.findViewById(R.id.titulo);
            fotoRestaurante=item.findViewById(R.id.ft1);
            descripcionRestaurante=item.findViewById(R.id.descripcion);
            rangoPrecioRestaurante=item.findViewById(R.id.precio);

        }

        public void actualizarDatos(MoldeRestaurante moldeRestaurante) {
            nombreRestaurante.setText(moldeRestaurante.getNombre());
            fotoRestaurante.setImageResource(moldeRestaurante.getFoto());
            descripcionRestaurante.setText(moldeRestaurante.getDescripcion());
            rangoPrecioRestaurante.setText(moldeRestaurante.getRangoPrecio());

        }
    }
}
