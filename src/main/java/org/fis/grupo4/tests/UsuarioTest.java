package org.fis.grupo4.tests;

import org.fis.grupo4.Usuario;
import org.fis.grupo4.Libro;
import org.fis.grupo4.Prestamo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class UsuarioTest {
    private Usuario usuario;
    private Libro libroDisponible;
    private Libro libroNoDisponible;

    @Before
    public void setup() {
        usuario = new Usuario("Juan", "Perez", 123456789, "juan@email.com", 1234567, "BASICO");
        libroDisponible = new Libro("El Quijote", "Cervantes", "Novela", 1605, 1);
        libroNoDisponible = new Libro("Don Juan", "Zorrilla", "Drama", 1844, 1);
        libroNoDisponible.setDisponible(false);
    }

    @Test
    public void testSolicitarPrestamo_LibroDisponible() {
        Prestamo prestamo = usuario.solicitarPrestamo(libroDisponible);
        assertNotNull(prestamo);
        assertFalse(libroDisponible.isDisponible());
    }

    @Test
    public void testSolicitarPrestamo_LibroNoDisponible() {
        Prestamo prestamo = usuario.solicitarPrestamo(libroNoDisponible);
        assertNull(prestamo);
    }

    @Test
    public void testSolicitarPrestamo_Borde_LibroSinTitulo() {
        Libro sinTitulo = new Libro("", "Autor Test", "Genero Test", 2024, 1);
        Prestamo prestamo = usuario.solicitarPrestamo(sinTitulo);
        assertNull(prestamo);
    }
}