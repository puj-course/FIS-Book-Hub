package org.fis.grupo3;

public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private boolean disponible;
    private static List<Libro> catalogo = new ArrayList<>();

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
        return this.estado.equalsIgnoreCase("disponible");
    }
    

    public void actualizarDisponibilidad(boolean estado) {
        this.disponible = estado;
    }

    public void registrarLibro() {
        catalogo.add(this);
        System.out.println("Libro registrado: " + this.getTitulo());
    }
    

}
