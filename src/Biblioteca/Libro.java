package Biblioteca;

class Libro {
    private String titulo;
    private String autor;
    private String ID;
    private boolean disponible = true;

    public Libro(String titulo, String autor, String ID) {
        this.titulo = titulo;
        this.autor = autor;
        this.ID = ID;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getID() {
        return ID;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setID(String iD) {
        ID = iD;
    }

    @Override
    public String toString() {
        return "LIBRO [Titulo: " + titulo + ", autor: " + autor + ", ID: " + ID + 
                ", disponible: " + disponible + "]";
    }
}