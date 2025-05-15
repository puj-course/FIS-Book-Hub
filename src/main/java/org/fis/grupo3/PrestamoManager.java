package org.fis.grupo3;

public class PrestamoManager {
    private static int contadorPrestamos = 1;

    public static void procesarNuevoPrestamo(PrestamoMediator mediator) {
        int id = contadorPrestamos++;
        Prestamo prestamo = mediator.generarPrestamo(id);

        if (prestamo != null) {
            SistemaBiblioteca.getInstancia().agregarPrestamo(prestamo);
            System.out.println("Préstamo registrado correctamente con ID: " + id);
        } else {
            System.out.println("No se pudo registrar el préstamo.");
        }
    }
}
