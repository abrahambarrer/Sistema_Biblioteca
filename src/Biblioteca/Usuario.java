package Biblioteca;

import java.util.List;

public class Usuario {
    private String nombre;
    private String ID;


    public Usuario(String nombre, String ID) {
        this.nombre = nombre;
        this.ID = ID;
    }


    public String getNombre() {
        return nombre;
    }


    public String getID() {
        return ID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setID(String iD) {
        ID = iD;
    }


    @Override
    public String toString() {
        return "USUARIO [Nombre: " + nombre + ", ID: " + ID + "]";
    }
}
