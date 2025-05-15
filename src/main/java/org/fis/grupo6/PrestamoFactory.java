package org.fis.grupo6;

import java.util.Date;

public class PrestamoFactory extends PrestamoFactoryMethod {
    @Override
    public Prestamo crearPrestamo(Usuario usuario, Libro libro) {
        Prestamo prestamo = new Prestamo();
        prestamo.usuario = usuario;
        prestamo.libro = libro;
        prestamo.fechaPrestamo = new Date();
        prestamo.fechaDevolucionEstimada = new Date(System.currentTimeMillis() + 7L * 24 * 60 * 60 * 1000);
        prestamo.estado = "Activo";
        return prestamo;
    }
}
