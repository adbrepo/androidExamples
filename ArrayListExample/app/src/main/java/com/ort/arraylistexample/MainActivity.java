package com.ort.arraylistexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.ort.arraylistexample.models.Usuario;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Usuario> listaDeUsuarios = new ArrayList<Usuario>();
    private Usuario nuevoUsuario ;
    private Usuario usuarioActual;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*Agregar items a la lista*/
        listaDeUsuarios.add(new Usuario ("ale","ale@pepe.com.ar"));
        listaDeUsuarios.add(new Usuario ("mica","mica@pepe.com.ar"));
        listaDeUsuarios.add(new Usuario ("nestor","nestor@pepe.com.ar"));

        nuevoUsuario = new Usuario("nuevo","nuevo@pepe.com.ar");

        listaDeUsuarios.add(nuevoUsuario);


        /*Leer elementos de la lista*/

        usuarioActual = listaDeUsuarios.get(1);
        Log.d("test",usuarioActual.getNombre() + " " + usuarioActual.getEmail());

        /*editar elementos de la lista*/

        listaDeUsuarios.set(1,new Usuario ("mica","mica1@pepe.com.ar"));
        usuarioActual = listaDeUsuarios.get(1);
        Log.d("test",usuarioActual.getNombre() + " " + usuarioActual.getEmail());

        Log.d("test"," ");

        /*Recorrer listado */

        for(Usuario usuarioActual : listaDeUsuarios){

            Log.d("test",usuarioActual.getNombre() + " " + usuarioActual.getEmail());
        }

        /*eliminar elementos de la lista*/

        listaDeUsuarios.remove(1);
        Log.d("test"," ");

        for(Usuario usuarioActual : listaDeUsuarios){

            Log.d("test",usuarioActual.getNombre() + " " + usuarioActual.getEmail());

        }

        boolean encontrado = false;
        int posicion = 0;

        while (encontrado == false && posicion < listaDeUsuarios.size()){

            if(listaDeUsuarios.get(posicion).getNombre().equals("nestor")){

                encontrado = true;
            }
            else {
                posicion = posicion + 1;
            }
        }


        if(encontrado == false){
            Log.d("test", "Usuario no encontrado");
        }
        else
        {
            Log.d("test",listaDeUsuarios.get(posicion).getNombre() + " " + listaDeUsuarios.get(posicion).getEmail());
        }
    }

}
