package org.fis.grupo4.tests;

import org.fis.grupo4.Administrador;
import org.fis.grupo4.Usuario;
import org.fis.grupo4.Libro;
import org.fis.grupo4.Prestamo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class AdministradorTest {
    private Administrador administrador;
    private List<Usuario> usuarios;
    private Usuario usuario;
    private Libro libro;

    @Before
    public void setup() {
        administrador = Administrador.getInstancia();
        usuarios = new ArrayList<>();
        usuario = new Usuario("Juan", "Perez", 123456789, "juan@email.com", 1234567, "BASICO");
        libro = new Libro("El Quijote", "Cervantes", "Novela", 1605, 1);
    }

    @Test
    public void testCrearUsuario_Positive() {
        administrador.crearUsuario(usuario, usuarios);
        assertTrue(usuarios.contains(usuario));
    }

    @Test
    public void testCrearUsuario_Negative_Duplicado() {
        administrador.crearUsuario(usuario, usuarios);
        administrador.crearUsuario(usuario, usuarios);
        assertEquals(1, usuarios.size());
    }

    @Test
    public void testEliminarUsuario_Positive() {
        administrador.crearUsuario(usuario, usuarios);
        administrador.eliminarUsuario(usuario, usuarios);
        assertFalse(usuarios.contains(usuario));
    }

    @Test
    public void testEliminarUsuario_Negative_NoExiste() {
        administrador.eliminarUsuario(usuario, usuarios);
        assertTrue(usuarios.isEmpty());
    }

    @Test
    public void testCantidadPrestamosActivos_Positive() {
        Usuario u1 = new Usuario("Juan", "Perez", 123456789, "juan@email.com", 1234567, "BASICO");
        Usuario u2 = new Usuario("Maria", "Lopez", 987654321, "maria@email.com", 9876543, "BASICO");
        Libro l1 = new Libro("Libro 1", "Autor 1", "Genero 1", 2024, 1);
        Libro l2 = new Libro("Libro 2", "Autor 2", "Genero 2", 2024, 1);
        
        Prestamo p1 = new Prestamo(u1, l1);
        Prestamo p2 = new Prestamo(u2, l2);
        
        List<Prestamo> prestamos = new ArrayList<>();
        prestamos.add(p1);
        prestamos.add(p2);
        
        assertEquals(2, administrador.cantidadPrestamosActivos(prestamos));
    }

    @Test
    public void testCantidadPrestamosActivos_Negative() {
        List<Prestamo> prestamos = new ArrayList<>();
        assertEquals(0, administrador.cantidadPrestamosActivos(prestamos));
    }
}