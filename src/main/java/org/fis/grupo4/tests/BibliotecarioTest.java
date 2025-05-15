package org.fis.grupo4.tests;

import org.fis.grupo4.Bibliotecario;
import org.fis.grupo4.Usuario;
import org.fis.grupo4.Libro;
import org.fis.grupo4.Prestamo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class BibliotecarioTest {
    private Bibliotecario bibliotecario;
    private List<Libro> libros;
    private Usuario usuario;
    private Libro libro;

    @Before
    public void setup() {
        bibliotecario = new Bibliotecario(1);
        libros = new ArrayList<>();
        usuario = new Usuario("Juan", "Perez", 123456789, "juan@email.com", 1234567, "BASICO");
        libro = new Libro("El Quijote", "Cervantes", "Novela", 1605, 1);
    }

    @Test
    public void testRegistrarLibro_Positive() {
        bibliotecario.registrarLibro(libro, libros);
        assertTrue(libros.contains(libro));
    }

    @Test
    public void testRegistrarLibro_Negative_Duplicado() {
        bibliotecario.registrarLibro(libro, libros);
        bibliotecario.registrarLibro(libro, libros);
        assertEquals(1, libros.size());
    }

    @Test
    public void testRegistrarDevolucion_Positive() {
        Prestamo prestamo = new Prestamo(usuario, libro);
        prestamo.registrarDevolucion();
        assertTrue(prestamo.isDevuelto());
        assertTrue(libro.isDisponible());
    }
}