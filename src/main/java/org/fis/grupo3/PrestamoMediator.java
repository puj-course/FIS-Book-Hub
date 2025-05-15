package org.fis.grupo3;

import java.time.LocalDate;

public class PrestamoMediator {
    private Usuario usuario;
    private Libro libro;

    public PrestamoMediator(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    public boolean validarPrestamo() {
        if (libro == null || usuario == null) {
            System.out.println("Error: Usuario o libro no especificado.");
            return false;
        }

        if (!libro.isDisponible()) {
            System.out.println("El libro '" + libro.getTitulo() + "' no está disponible.");
            return false;
        }

        return true;
    }

    public Prestamo generarPrestamo(int idPrestamo) {
        if (!validarPrestamo()) {
            return null;
        }

        LocalDate hoy = LocalDate.now();
        LocalDate fechaLimite = hoy.plusDays(14);

        Prestamo prestamo = new Prestamo(idPrestamo, usuario, libro, hoy, fechaLimite);
        prestamo.actualizarEstado("Aprobado");
        libro.actualizarDisponibilidad(false);

        return prestamo;
    }
}
