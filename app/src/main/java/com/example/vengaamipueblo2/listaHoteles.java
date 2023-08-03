package com.example.vengaamipueblo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.vengaamipueblo2.adaptadores.HotelAdaptador;
import com.example.vengaamipueblo2.moldes.MoldeHotel;

import java.util.ArrayList;

public class listaHoteles extends AppCompatActivity {
    ArrayList<MoldeHotel> listaHoteles=new ArrayList<>();
    RecyclerView recyclerHoteles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerHoteles=findViewById(R.id.listadinamicahoteles);
        recyclerHoteles.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL, false));

        crearLista();
        HotelAdaptador adaptador=new HotelAdaptador(listaHoteles);
        recyclerHoteles.setAdapter(adaptador);
    }

    public void crearLista(){
        listaHoteles.add(new MoldeHotel("Hotel1","2500000",R.drawable.hoteluno));
        listaHoteles.add(new MoldeHotel("Hotel2","2500000",R.drawable.hotelc));
        listaHoteles.add(new MoldeHotel("Hotel3","2500000",R.drawable.hotelcu));
        listaHoteles.add(new MoldeHotel("Hotel4","2500000",R.drawable.hoteldo));
        listaHoteles.add(new MoldeHotel("Hotel5","2500000",R.drawable.hotelse));
        listaHoteles.add(new MoldeHotel("Hotel6","2500000",R.drawable.doshotel));
    }
}