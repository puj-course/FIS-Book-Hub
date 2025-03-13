package org.fis.grupo3;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Usuario{
    public Administrador(int id, String nombre, String correo) {
        super(id, nombre, correo, "Administrador");
    }

    public void generarReportes() {
        System.out.println("Generando reportes de libros prestados...");
    }
    public void analizarDatos() {
        // Implementación pendiente
    }

    public int cantidadLibrosDisponibles() {
        // Implementación pendiente
        return 0;
    }

    public int cantidadPrestamosActivos() {
        // Implementación pendiente
        return 0;
    }

    public int cantidadLibrosDevueltosUltimoMes() {
        // Implementación pendiente
        return 0;
    }

    public List<String> listarUsuariosConRetrasos() {
        // Implementación pendiente
        return new ArrayList<>();
    }
}
