package org.fis.grupo3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PruebasUnitarias {

    private Libro libro;
    private Prestamo prestamo;
    private Administrador admin;
    private Usuario usuario;

    @BeforeEach
    public void setUp() {
        libro = new Libro("El Principito", "Antoine de Saint-Exupéry", "disponible");
        usuario = new Usuario(3, "Laura", "laura@correo.com", "Estudiante");
        prestamo = new Prestamo(1, usuario, libro, LocalDate.now().minusDays(10), LocalDate.now().minusDays(3));
        admin = Administrador.getInstancia(1, "Admin", "admin@bookhub.com");
    }

    @Test
    public void testLibroDisponible() {
        assertTrue(libro.isDisponible(), "El libro debería estar disponible");
    }

    @Test
    public void testSingletonAdministrador() {
        Administrador a2 = Administrador.getInstancia(99, "Otro", "otro@admin.com");
        assertEquals(admin, a2, "Debe devolver la misma instancia de administrador (Singleton)");
    }

    @Test
    public void testCantidadLibrosDisponibles() {
        List<Libro> lista = new ArrayList<>();
        lista.add(libro);
        lista.add(new Libro("Don Quijote", "Cervantes", "prestado"));

        int disponibles = admin.cantidadLibrosDisponibles(lista);
        assertEquals(1, disponibles, "Debe haber un solo libro disponible");
    }

    @Test
    public void testPrestamoEstaAtrasado() {
        assertTrue(prestamo.estaAtrasado(), "El préstamo debería estar atrasado");
    }

    @Test
    public void testRegistrarDevolucion() {
        Bibliotecario b = new Bibliotecario(2, "Mario", "mario@bookhub.com");
        b.registrarDevolucion(prestamo);

        assertTrue(prestamo.isDevuelto(), "El préstamo debe marcarse como devuelto");
        assertNotNull(prestamo.getFechaDevolucion(), "La fecha de devolución debe estar asignada");
    }

    @Test
    public void testDevueltoEnUltimoMes() {
        prestamo.setDevuelto(true);
        prestamo.setFechaDevolucion(LocalDate.now().minusDays(5));

        assertTrue(prestamo.devueltoEnUltimoMes(), "Debe detectar que fue devuelto este mes");
    }

    @Test
    public void testDescripcionLibroDecorator() {
        Libro reservado = new LibroReservado(libro);
        assertEquals("El Principito por Antoine de Saint-Exupéry [Reservado]", reservado.getDescripcion());
    }
}
