package com.fis;

import org.fis.grupo6.Prestamo;
import org.fis.grupo6.Libro;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class PrestamoTest {

    @Test
    void testRegistrarDevolucion() {
        Prestamo prestamo = new Prestamo();
        prestamo.libro = new Libro();
        prestamo.libro.titulo = "Java EE";
        prestamo.registrarDevolucion();
    }

    @Test
    void testVerificarRetraso() {
        Prestamo prestamo = new Prestamo();
        prestamo.verificarRetraso();
    }

    @Test
    void testRegistrarDevolucionLibroNulo() {
        Prestamo prestamo = new Prestamo();
        assertThrows(NullPointerException.class, () -> {
            prestamo.registrarDevolucion();
        });
    }

    @Test
    void testRegistrarDevolucionFechaPasada() {
        Prestamo prestamo = new Prestamo();
        prestamo.fechaDevolucionEstimada = new Date(System.currentTimeMillis() - 5 * 86400000L);
        prestamo.verificarRetraso();
    }
}