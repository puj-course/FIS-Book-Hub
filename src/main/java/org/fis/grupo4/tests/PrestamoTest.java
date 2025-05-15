package org.fis.grupo4.tests;

import org.fis.grupo4.Usuario;
import org.fis.grupo4.Libro;
import org.fis.grupo4.Prestamo;
import org.fis.grupo4.MultaBasica;
import org.fis.grupo4.MultaPremium;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrestamoTest {
    private Usuario usuario;
    private Libro libro;
    private Prestamo prestamo;

    @Before
    public void setup() {
        usuario = new Usuario("Juan", "Perez", 123456789, "juan@email.com", 1234567, "BASICO");
        libro = new Libro("El Quijote", "Cervantes", "Novela", 1605, 1);
        prestamo = new Prestamo(usuario, libro);
    }

    @Test
    public void testRegistrarDevolucion_Positive() {
        prestamo.registrarDevolucion();
        assertTrue(prestamo.isDevuelto());
        assertNotNull(prestamo.getFechaDevolucion());
    }

    @Test
    public void testRegistrarDevolucion_Negative_DevolucionDuplicada() {
        prestamo.registrarDevolucion();
        prestamo.registrarDevolucion();
        assertTrue(prestamo.isDevuelto());
    }

    @Test
    public void testCalcularMulta_Basica() {
        prestamo.setEstrategiaMulta(new MultaBasica());
        double multa = prestamo.calcularMulta(5); // 5 días de retraso
        assertEquals(5000.0, multa, 0.001); // $1000 por día
    }

    @Test
    public void testCalcularMulta_Premium() {
        prestamo.setEstrategiaMulta(new MultaPremium());
        double multa = prestamo.calcularMulta(5); // 5 días de retraso
        assertEquals(10000.0, multa, 0.001); // $2000 por día
    }
}