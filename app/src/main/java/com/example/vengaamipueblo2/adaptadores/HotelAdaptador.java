package com.example.vengaamipueblo2.adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vengaamipueblo2.R;
import com.example.vengaamipueblo2.moldes.MoldeHotel;

import java.util.ArrayList;

//viewHolder mantener una vista
public class HotelAdaptador extends RecyclerView.Adapter<HotelAdaptador.viewHolder> {
    //dar click en el bombillito seleccionar el primero y luego dar clic a las 3 herencias

    //Atributos //ArrayLista: la lista //nombre
    public ArrayList<MoldeHotel> listaHoteles;

    //Constructor
    public HotelAdaptador(ArrayList<MoldeHotel> listaHoteles) {
        this.listaHoteles = listaHoteles;
    }



    @NonNull //estas son anotaciones
    @Override //estas son anotaciones
    //onCreate disparar
    //Asociar y pintar
    public HotelAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       //null es vacio    (i es una interacion)
        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.moldehotel,null, false);
        return new viewHolder(vista);
    }
    //para identificar las lista que voy a pintar
    @Override
    public void onBindViewHolder(@NonNull HotelAdaptador.viewHolder viewHolder, int i) {
        //get: obtener
        viewHolder.actualizarDatos(listaHoteles.get(i));

    }
    @Override
    //getItemCount: obtener la cantidad de elementos
    public int getItemCount() {
        return listaHoteles.size();
    }
    //luego vamos de nuevo al bombillito y seleccionamos la primera y se crea la clase y de nuevo vamos al bombillo y damos a la extension

    //Asociar los elementos del model
    public class viewHolder extends RecyclerView.ViewHolder {
        TextView nombreHotel;
        TextView precioHotel;
        ImageView fotoHotel;

        public viewHolder(View item){
            super(item);//findViewById sirve para buscar
            fotoHotel=item.findViewById(R.id.fotoitem);
            nombreHotel=item.findViewById(R.id.tituloitem);
            precioHotel=item.findViewById(R.id.precioitem);

        }

        public void actualizarDatos(MoldeHotel moldeHotel) {
            fotoHotel.setImageResource(moldeHotel.getFoto());
            nombreHotel.setText(moldeHotel.getNombre());
            precioHotel.setText(moldeHotel.getPrecio());
        }
    }
}
