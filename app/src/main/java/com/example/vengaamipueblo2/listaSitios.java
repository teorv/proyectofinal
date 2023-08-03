package com.example.vengaamipueblo2;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.example.vengaamipueblo2.adaptadores.SitioAdaptador;
import com.example.vengaamipueblo2.moldes.MoldeSitio;
import java.util.ArrayList;

public class listaSitios extends AppCompatActivity {
    ArrayList<MoldeSitio> listaSitios = new ArrayList<>();
    RecyclerView recyclerSitios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios);
        recyclerSitios = findViewById(R.id.listadinamicasitio);
        recyclerSitios.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        crearLista();
        SitioAdaptador adaptador = new SitioAdaptador(listaSitios);
        recyclerSitios.setAdapter(adaptador);
    }
    public void crearLista() {
        listaSitios.add(new MoldeSitio("El lugar de tus sueños", "8265960", "10000", R.drawable.sitiouno));
        listaSitios.add(new MoldeSitio("El lugar de tus sueños", "8520552", "20000", R.drawable.sitiodos));
        listaSitios.add(new MoldeSitio("El lugar de tus sueños", "8520662", "30000", R.drawable.sitiotres));
        listaSitios.add(new MoldeSitio("El lugar de tus sueños", "8281550", "40000", R.drawable.sitiocuatro));
        listaSitios.add(new MoldeSitio("El lugar de tus sueños", "8220562", "60000", R.drawable.sitiocinco));
        listaSitios.add(new MoldeSitio("El lugar de tus sueños", "8279166", "70000", R.drawable.sitioseis));
    }
}