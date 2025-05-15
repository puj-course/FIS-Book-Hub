package org.fis.grupo4;

import java.util.Date;

public class Prestamo {
    // Atributos
    private Usuario usuario;
    private Libro libro;
    private Date fechaPrestamo;
    private Date fechaDevolucionEstimada;
    private String estado;
    private boolean devuelto;
    private Date fechaDevolucion;

    // Tipo de multa usando patron Strategy
    private EstrategiaMulta estrategiaMulta;
    
    // Constructor
    public Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaPrestamo = new Date();
        this.fechaDevolucionEstimada = new Date(fechaPrestamo.getTime() + (14 * 24 * 60 * 60 * 1000)); // 14 días
        this.estado = "ACTIVO";
        this.devuelto = false;
    }
    
    // Getters y Setters
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Libro getLibro() {
        return libro;
    }
    
    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    
    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }
    
    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    
    public Date getFechaDevolucionEstimada() {
        return fechaDevolucionEstimada;
    }
    
    public void setFechaDevolucionEstimada(Date fechaDevolucionEstimada) {
        this.fechaDevolucionEstimada = fechaDevolucionEstimada;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public boolean isDevuelto() {
        return devuelto;
    }
    
    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }
    
    // Métodos
    public void registrarDevolucion() {
    if (!devuelto) {
        this.devuelto = true;
        this.fechaDevolucion = new Date(); // ahora
        System.out.println("Devolución registrada del libro: " + libro.getTitulo());
    } else {
        System.out.println("Este libro ya fue devuelto.");
    }
}
    
    public void verificarRetraso() {
        // Aquí irá la implementación de verificarRetraso()
    }


    public void setEstrategiaMulta(EstrategiaMulta estrategia) {
        this.estrategiaMulta = estrategia;
    }

    public double calcularMulta(int diasRetraso) {
        if (estrategiaMulta == null) {
            estrategiaMulta = new MultaBasica(); // Por defecto uso una multa basica
        }
        return estrategiaMulta.calcularMulta(diasRetraso);
    }
} 