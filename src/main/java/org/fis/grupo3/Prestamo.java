package org.fis.grupo3;

import java.time.LocalDate;

public class Prestamo {
    private int id;
    private Usuario usuario;
    private Libro libro;
    private LocalDate fechaInicio;
    private LocalDate fechaLimite;
    private LocalDate fechaDevolucion;
    private String estado; // Pendiente, Aprobado, Rechazado
    private boolean devuelto;

    public Prestamo(int id, Usuario usuario, Libro libro, LocalDate fechaInicio, LocalDate fechaLimite) {
        this.id = id;
        this.usuario = usuario;
        this.libro = libro;
        this.fechaInicio = fechaInicio;
        this.fechaLimite = fechaLimite;
        this.estado = "Pendiente";
        this.devuelto = false;
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("El estado del préstamo ha sido actualizado a: " + nuevoEstado);
    }

    public void verificarRetraso() {
        if (!devuelto && LocalDate.now().isAfter(fechaLimite)) {
            System.out.println(" El préstamo del libro \"" + libro.getTitulo() + "\" está retrasado.");
        } else {
            System.out.println(" El préstamo está dentro del plazo.");
        }
    }

    public boolean isDevuelto() {
        return this.devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    public boolean devueltoEnUltimoMes() {
        return this.devuelto && this.fechaDevolucion != null &&
               this.fechaDevolucion.isAfter(LocalDate.now().minusMonths(1));
    }

    public boolean estaAtrasado() {
        return !devuelto && LocalDate.now().isAfter(this.fechaLimite);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public LocalDate getFechaDevolucion() {
        return this.fechaDevolucion;
    }
}
