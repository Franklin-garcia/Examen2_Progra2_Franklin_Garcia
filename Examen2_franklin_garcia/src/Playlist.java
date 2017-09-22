
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Franklin Garcia
 */
public class Playlist {
    String nombre;
    ArrayList<canciones>lista_canciones=new ArrayList();

    public Playlist() {
    }

    public Playlist(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<canciones> getLista_canciones() {
        return lista_canciones;
    }

    public void setLista_canciones(ArrayList<canciones> lista_canciones) {
        this.lista_canciones = lista_canciones;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
