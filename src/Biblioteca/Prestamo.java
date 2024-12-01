package Biblioteca;

public class Prestamo {
    Usuario usuario;
    Libro libro;
    int prestamoID;

    public Prestamo(Usuario usuario, Libro libro, int prestamoID){
        this.usuario = usuario;
        this.libro = libro;
        this.prestamoID = prestamoID;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public int getPrestamoID() {
        return prestamoID;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setPrestamoID(int prestamoID) {
        this.prestamoID = prestamoID;
    }

    @Override
    public String toString() {
        return "PRESTAMO: " + usuario + "\nLIBRO [Titulo: " + libro.getTitulo()
                + ", autor: " + libro.getAutor() + ", ID: " + libro.getID() + "]";
    }
}
