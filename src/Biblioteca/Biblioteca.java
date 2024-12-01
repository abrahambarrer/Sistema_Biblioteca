package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Libro> libros; // Declarar lista dinamica de libros
    List<Usuario> usuarios; // Declarar lista dinamica de usuarios
    List<Prestamo> prestamos;
    int numeroPrestamos = 0;

    public Biblioteca(){
        libros = new ArrayList<>(); // Reservar memoria para el atributo de libros
        usuarios = new ArrayList<>(); // Reservar memoria para el atributo usuarios
        prestamos = new ArrayList<>(); // Reservar memoria para el atributo prestamos
    }

    public void agregarLibro(String titulo, String autor, String ID){
        libros.add(new Libro(titulo, autor, ID));
        System.out.println("\nLIBRO AGREGADO");
    }

    public void eliminarLibro(String ID){
        boolean eliminado = false;
        for (int i = 0; i < libros.size(); i++){
            if (libros.get(i).getID().equalsIgnoreCase(ID)){
                libros.remove(i);
                System.out.println("\nLIBRO AGREGADO");
                eliminado = true;
                break;
            }
        }

        if (!eliminado)
            System.out.println("\nNO EXISTE EL LIBRO CON ID: " + ID);
    }

    public void buscarLibro(String titulo){
        boolean encontrado = false;
        System.out.println("RESULTADOS DE: " + titulo);
        for (Libro libro : libros){
            if (libro.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println(libro);
                encontrado = true;
            }
        }
        if (!encontrado)
            System.out.println("\nLIBRO NO ENCONTRADO");
    }

    public void mostrarCatalogo(){
        System.out.println("\nCATALAGO");
        if (libros.isEmpty()){
            System.out.println("\nNO HAY LIBROS POR MOSTRAR");
        } else {
            for (Libro libro : libros)
                System.out.println(libro);
        }
    }

    public void mostrarDisponibles(){
        System.out.println("\nDISPONIBLES");
        if (libros.isEmpty()){
            System.out.println("\nNO HAY LIBROS POR MOSTRAR");
        } else {
            for (Libro libro : libros)
                if (libro.getDisponible())
                    System.out.println(libro);
        }
    }

    public void agregarUsuario(String nombre, String ID){
        usuarios.add(new Usuario(nombre, ID));
        System.out.println("\nUSUARIO AGREGADO");
    }


    public void eliminarUsuario(String ID){
        boolean eliminado = false;
        for (int i = 0; i < usuarios.size(); i++){
            if (usuarios.get(i).getID().equalsIgnoreCase(ID)){
                usuarios.remove(i);
                System.out.println("\nUSUARIO ELIMINADO");
                eliminado = true;
                break;
            }
        }

        if (!eliminado)
            System.out.println("\nNO EXISTE EL USUARIO: " + ID);
    }

    public void buscarUsuario(String ID){
        for (Usuario usuario : usuarios){
            if (usuario.getID().equals(ID)){
                System.out.println("\nUSUARIO ENCONTRADO: " + usuario);
                return;
            }
        }
        System.out.println("\nUSUARIO NO ENCONTRADO");
    }

    public void mostrarUsuarios(){
        if (usuarios.isEmpty()){
            System.out.println("\nNO HAY USUARIOS POR MOSTRAR");
        } else {
            for (Usuario usuario : usuarios)
                System.out.println(usuario);
        }
    }

    public void realizarPrestamo(String libroID, String usuarioID){
        for (Libro libro : libros) {
            if (libro.getID().equalsIgnoreCase(libroID) && libro.getDisponible()) {
                for (Usuario usuario : usuarios){
                    if (usuario.getID().equals(usuarioID)){
                        prestamos.add(new Prestamo(usuario, libro, numeroPrestamos));
                        libro.setDisponible(false);
                        System.out.println("\nPRESTAMO EXITOSO");
                        numeroPrestamos += 1;
                        return;
                    }
                }
            }
        }
        // Si no encuentra ningún ejemplar disponible
        System.out.println("\nERROR");
    }

    public void restaurarLibro(String libroID){
        boolean devuelto = false;
        for (int i = 0; i < prestamos.size(); i++){
            if (prestamos.get(i).getLibro().getID().equals(libroID)){
                prestamos.remove(i);
                devuelto = true;
                break;
            }
        }
        if (devuelto){
            for (Libro libro : libros){
                if (libro.getID().equals(libroID)){
                    libro.setDisponible(true);
                    System.out.println("\nDEVOLUCION EXITOSA");
                    break;
                }
            }
        }
        else
            System.out.println("\nERROR");
    }

    public void mostrarPrestamos(){
        if (prestamos.isEmpty()){
            System.out.println("\nNO HAY PRESTAMOS");
        }
        else{
            System.out.println("--- PRESTAMOS ACTIVOS ---\n");
            for (Prestamo prestamo : prestamos){
                System.out.println(prestamo);
            }
        }
    }

}