package com.fis;

import org.fis.grupo6.Bibliotecario;
import org.fis.grupo6.Libro;
import org.fis.grupo6.Prestamo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BibliotecarioTest {

    @Test
    void testRegistrarLibro() {
        Bibliotecario b = new Bibliotecario();
        Libro l = new Libro();
        l.titulo = "Patrones de Diseño";
        b.registrarLibro(l);
    }

    @Test
    void testRegistrarDevolucion() {
        Bibliotecario b = new Bibliotecario();
        Prestamo p = new Prestamo();
        b.registrarDevolucion(p);
    }

    @Test
    void testRegistrarLibroNulo() {
        Bibliotecario b = new Bibliotecario();
        assertThrows(NullPointerException.class, () -> {
            b.registrarLibro(null);
        });
    }

    @Test
    void testVerificarRetrasos() {
        Bibliotecario b = new Bibliotecario();
        b.verificarRetrasos();
    }
}