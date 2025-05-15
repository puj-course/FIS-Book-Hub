package org.fis.grupo3;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Usuario {
    private static Administrador instancia;

    private Administrador(int id, String nombre, String correo) {
        super(id, nombre, correo, "Administrador");
    }

    public static synchronized Administrador getInstancia(int id, String nombre, String correo) {
        if (instancia == null) {
            instancia = new Administrador(id, nombre, correo);
        }
        return instancia;
    }

    public void generarReportes() {
        System.out.println("Generando reportes de libros prestados...");
    }

    public void analizarDatos() {
        System.out.println("Analizando datos de uso de la biblioteca...");
    }

    public int cantidadLibrosDisponibles(List<Libro> libros) {
        int contador = 0;
        for (Libro libro : libros) {
            if (libro.isDisponible()) contador++;
        }
        return contador;
    }

    public int cantidadPrestamosActivos(List<Prestamo> prestamos) {
        int contador = 0;
        for (Prestamo p : prestamos) {
            if (!p.isDevuelto()) contador++;
        }
        return contador;
    }

    public int cantidadLibrosDevueltosUltimoMes(List<Prestamo> prestamos) {
        int contador = 0;
        for (Prestamo p : prestamos) {
            if (p.devueltoEnUltimoMes()) contador++;
        }
        return contador;
    }

    public List<String> listarUsuariosConRetrasos(List<Prestamo> prestamos) {
        List<String> usuarios = new ArrayList<>();
        for (Prestamo p : prestamos) {
            if (p.estaAtrasado() && !usuarios.contains(p.getUsuario().getNombre())) {
                usuarios.add(p.getUsuario().getNombre());
            }
        }
        return usuarios;
    }
}
