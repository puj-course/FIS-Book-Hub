package com.fis;

import org.fis.grupo6.Administrador;
import org.junit.jupiter.api.Test;

public class AdministradorTest {

    @Test
    void testAnalizarDatos() {
        new Administrador().analizarDatos();
    }

    @Test
    void testListarUsuariosConRetrasos() {
        new Administrador().listarUsuariosConRetrasos();
    }

    @Test
    void testCantidadLibrosDisponibles() {
        new Administrador().cantidadLibrosDisponibles();
    }

    @Test
    void testCantidadPrestamosActivos() {
        new Administrador().cantidadPrestamosActivos();
    }

    @Test
    void testCantidadLibrosDevueltosUltimoMes() {
        new Administrador().cantidadLibrosDevueltosUltimoMes();
    }
}