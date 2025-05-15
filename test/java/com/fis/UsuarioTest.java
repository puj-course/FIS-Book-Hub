package com.fis;

import org.fis.grupo6.Usuario;
import org.fis.grupo6.Libro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    void testSolicitarPrestamo() {
        Usuario usuario = new Usuario();
        usuario.nombre = "Ana";
        Libro libro = new Libro();
        libro.titulo = "Clean Code";
        usuario.solicitarPrestamo(libro);
    }

    @Test
    void testSolicitarPrestamoLibroNulo() {
        Usuario usuario = new Usuario();
        assertThrows(NullPointerException.class, () -> {
            usuario.solicitarPrestamo(null);
        });
    }

    @Test
    void testSolicitarPrestamoLibroSinTitulo() {
        Usuario usuario = new Usuario();
        Libro libro = new Libro();
        libro.titulo = "";
        usuario.solicitarPrestamo(libro);
    }
}