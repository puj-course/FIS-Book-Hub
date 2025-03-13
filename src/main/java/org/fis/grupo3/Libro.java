package org.fis.grupo3;

public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void actualizarDisponibilidad(boolean estado) {
        this.disponible = estado;
    }

    public void registrarLibro(){
        //implementacion
    }

}
