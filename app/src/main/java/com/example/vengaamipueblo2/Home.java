package com.example.vengaamipueblo2;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class Home extends AppCompatActivity {

    //ZONA DE ATRIBUTOS
    Button botonHoteles;
    Button botonRestaurantes;
    Button botonSitiosTuristicos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //asociando los atributos de tipo boton a los ID que pusimos en xml
        botonHoteles=findViewById(R.id.botonhoteles);
        botonRestaurantes=findViewById(R.id.botonrestaurantes);
        botonSitiosTuristicos=findViewById(R.id.botonturismo);
        //escuchando los eventos de click en el boton
        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //abrimos una nueva actividad desde el HOME
                Intent intent= new Intent(Home.this,Hoteles.class);
                startActivity(intent);
            }
        });

        botonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Home.this,Restaurantes.class);
                startActivity(intent2);
            }
        });

        botonSitiosTuristicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Home.this,Sitios.class);
                startActivity(intent3);
            }
        });

    }

    //Cargamos el menu de opciones

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    //Función para cargar el funcionamiento del menu
    public boolean onOptionsItemSelected(MenuItem item)
    {
        //Observar el comportamiento del usuario frente al menu
        int itemSeleccionado=item.getItemId();

        switch (itemSeleccionado)
        {
            case(R.id.opcion1):
                this.cambiarIdioma("es");
                Intent intentEspanol = new Intent(Home.this, Home.class);
                startActivity(intentEspanol);
                break;
            case(R.id.opcion2):
                this.cambiarIdioma("en");
                Intent intentIngles= new Intent(Home.this,Home.class);
                startActivity(intentIngles);
                break;

            case(R.id.opcion3):
                this.cambiarIdioma("it");
                Intent intentItaliano= new Intent(Home.this,Home.class);
                startActivity(intentItaliano);
                break;

            case(R.id.opcion4):
                this.cambiarIdioma("pt");
                Intent intentPortugues= new Intent(Home.this,Home.class);
                startActivity(intentPortugues);
                break;
            case(R.id.acercade):
                Intent inetnet= new Intent(Home.this,Acercade.class);
                startActivity(inetnet);
        }
        return super.onOptionsItemSelected(item);
    }
    //metodo para cambiar el idioma de la app
    public void cambiarIdioma(String idioma){

        //Crear un objeto de la clase LOCALE para modificar el idioma
        Locale locale=new Locale(idioma);
        Locale.setDefault(locale);

        //Establer la configuración del idioma en el telefono
        Resources resources=getResources();
        Configuration configuration=resources.getConfiguration();
        configuration.setLocale(locale);


        //Actualizo la configuración del telefono
        //ejecutamos la configuracion
        getBaseContext().getResources().updateConfiguration(configuration,getBaseContext().getResources().getDisplayMetrics());

    }
}