package org.fis.grupo3;

import java.time.LocalDate;
import java.util.List;

public class Bibliotecario extends Usuario {

    public Bibliotecario(int id, String nombre, String correo) {
        super(id, nombre, correo, "Bibliotecario");
    }

    public void registrarDevolucion(Prestamo prestamo) {
        if (!prestamo.isDevuelto()) {
            prestamo.setDevuelto(true);
            prestamo.setFechaDevolucion(LocalDate.now());
            System.out.println(" Libro devuelto correctamente por: " + prestamo.getUsuario().getNombre());
        } else {
            System.out.println(" El préstamo ya ha sido devuelto previamente.");
        }
    }

    public void verificarRetrasos(List<Prestamo> prestamos) {
        System.out.println(" Usuarios con préstamos atrasados:");
        for (Prestamo p : prestamos) {
            if (p.estaAtrasado()) {
                System.out.println(p.getUsuario().getNombre() + " tiene préstamo atrasado del libro: " + p.getLibro().getTitulo());
            }
        }
    }

    public void registrarLibro(Libro libro) {
        libro.registrarLibro();
        System.out.println("Libro registrado por bibliotecario: " + this.getNombre());
    }
}
