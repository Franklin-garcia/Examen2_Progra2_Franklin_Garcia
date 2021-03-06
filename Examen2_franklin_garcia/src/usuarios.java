/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Franklin Garcia
 */
public class usuarios implements Serializable {

    private static final long SerialVersionUID = 777L;
    //nombre, edad, username, password, playlists , favoritos. 
    private String nombre;
    private int edad;
    private String username;
    private String password;
    private ArrayList<Playlist> lista_playlist = new ArrayList();
    private ArrayList<canciones> lista_favoritos = new ArrayList();

    public usuarios() {
    }

    public usuarios(String nombre, int edad, String username, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.username = username;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Playlist> getLista_playlist() {
        return lista_playlist;
    }

    public void setLista_playlist(ArrayList<Playlist> lista_playlist) {
        this.lista_playlist = lista_playlist;
    }

    public ArrayList<canciones> getLista_favoritos() {
        return lista_favoritos;
    }

    public void setLista_favoritos(ArrayList<canciones> lista_favoritos) {
        this.lista_favoritos = lista_favoritos;
    }

  

    @Override
    public String toString() {
        return nombre;
    }

}
