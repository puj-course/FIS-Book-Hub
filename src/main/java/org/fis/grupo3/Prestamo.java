package org.fis.grupo3;

public class Prestamo {
    private int id;
    private Usuario usuario;
    private Libro libro;
    private String fechaInicio;
    private String fechaDevolucion;
    private String estado; // Pendiente, Aprobado, Rechazado

    public Prestamo(int id, Usuario usuario, Libro libro, String fechaInicio, String fechaDevolucion) {
        this.id = id;
        this.usuario = usuario;
        this.libro = libro;
        this.fechaInicio = fechaInicio;
        this.fechaDevolucion = fechaDevolucion;
        this.estado = "Pendiente";
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("El estado del préstamo ha sido actualizado a: " + nuevoEstado);
    }

    public void verificarRetraso(String fechaInicio){
        //implementacion
    }
}
