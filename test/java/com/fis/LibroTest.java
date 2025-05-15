package com.fis;

import org.fis.grupo6.Libro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibroTest {

    @Test
    void testRegistrarLibro() {
        Libro libro = new Libro();
        libro.titulo = "El Quijote";
        libro.registrarLibro(); // Solo imprime en consola
    }

    @Test
    void testActualizarCopiasDisponibles() {
        Libro libro = new Libro();
        libro.numeroCopiasDisponibles = 2;
        libro.actualizarCopiasDisponibles();
        assertEquals(3, libro.numeroCopiasDisponibles);
    }

    @Test
    void testActualizarCopiasDisponiblesDesdeCero() {
        Libro libro = new Libro();
        libro.numeroCopiasDisponibles = 0;
        libro.actualizarCopiasDisponibles();
        assertEquals(1, libro.numeroCopiasDisponibles);
    }

    @Test
    void testActualizarCopiasDisponiblesLibroNulo() {
        Libro libro = null;
        assertThrows(NullPointerException.class, () -> {
            libro.actualizarCopiasDisponibles();
        });
    }
}
