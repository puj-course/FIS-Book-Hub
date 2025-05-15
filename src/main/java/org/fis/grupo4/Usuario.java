package org.fis.grupo4;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    // Atributos
    private String nombre;
    private String apellido;
    private Integer cc;
    private String correo;
    private Integer telefono;
    private String tipo;
    private List<Prestamo> prestamos;
    
    // Constructor
    public Usuario(String nombre, String apellido, Integer cc, String correo, Integer telefono, String tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cc = cc;
        this.correo = correo;
        this.telefono = telefono;
        this.tipo = tipo;
        this.prestamos = new ArrayList<>();
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public Integer getCc() {
        return cc;
    }
    
    public void setCc(Integer cc) {
        this.cc = cc;
    }
    
    public String getCorreo() {
        return correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public Integer getTelefono() {
        return telefono;
    }
    
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    // Métodos
    public Prestamo solicitarPrestamo(Libro libro) {
    if (!libro.isDisponible()) {
        System.out.println("El libro no está disponible para préstamo.");
        return null;
    }

    Prestamo nuevoPrestamo = new Prestamo(this, libro);
    libro.setDisponible(false);
    this.prestamos.add(nuevoPrestamo);

    System.out.println("Préstamo realizado: " + libro.getTitulo());
    return nuevoPrestamo;
}
} 