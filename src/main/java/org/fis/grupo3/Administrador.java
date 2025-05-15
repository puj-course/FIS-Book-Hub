package org.fis.grupo3;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Usuario {
    // Instancia única (Singleton)
    private static Administrador instancia;

    // Constructor privado para evitar múltiples instancias
    private Administrador(int id, String nombre, String correo) {
        super(id, nombre, correo, "Administrador");
    }

    // Método público estático para obtener la instancia única
    public static Administrador getInstancia(int id, String nombre, String correo) {
        if (instancia == null) {
            instancia = new Administrador(id, nombre, correo);
        }
        return instancia;
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
