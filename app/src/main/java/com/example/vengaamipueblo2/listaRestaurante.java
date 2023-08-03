package com.example.vengaamipueblo2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.vengaamipueblo2.adaptadores.RestauranteAdaptador;
import com.example.vengaamipueblo2.moldes.MoldeRestaurante;

import java.util.ArrayList;

public class listaRestaurante extends AppCompatActivity {
    ArrayList<MoldeRestaurante> listaRestaurante=new ArrayList<>();
    RecyclerView recyclerRestaurante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurante);
        recyclerRestaurante=findViewById(R.id.listadinamicarestaurante);
        recyclerRestaurante.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL, false));

        crearLista();
        RestauranteAdaptador adaptador=new RestauranteAdaptador(listaRestaurante);
        recyclerRestaurante.setAdapter(adaptador);
    }

    public void crearLista(){
        listaRestaurante.add(new MoldeRestaurante("Restaurante el Mocho","Todo en un solo lugar","10000",R.drawable.unorestaurante));
        listaRestaurante.add(new MoldeRestaurante("El rincon del sabor","Sabor inigualable","10000",R.drawable.dosrestaurante));
        listaRestaurante.add(new MoldeRestaurante("Delicias de la costa","El sabor de mamá","10000",R.drawable.tresrestaurante));
        listaRestaurante.add(new MoldeRestaurante("FOR ME","Fresco y delicioso","10000",R.drawable.cuatrorestaurante));
        listaRestaurante.add(new MoldeRestaurante("Te llena hasta el alma","Ven a disfrutar de los mejores platos","10000",R.drawable.cincorestaurante));
        listaRestaurante.add(new MoldeRestaurante("Restaurante el Maluco","Tu sabes que es calidad","10000",R.drawable.seisrestaurante));

    }
}