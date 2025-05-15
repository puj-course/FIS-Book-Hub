package org.fis.grupo4;

import java.util.List;

// Clase Administrador
public class Administrador {
    // Aplico patron Singleton para que solo exista una instancia de Administrador
    private static Administrador instancia;

    private Administrador() {}

    public static Administrador getInstancia() {
        if (instancia == null) {
            instancia = new Administrador();
        }
        return instancia;
    }

    // Atributo
    private int idAdministrador;

    // Constructor
    public Administrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    // Getter y Setter
    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    // Métodos
    public void analizarDatos() {
        // Aquí iría la implementación de analizarDatos()
    }

    public void cantidadLibrosDisponibles() {
        // Aquí iría la implementación de cantidadLibrosDisponibles()
    }

    public int cantidadPrestamosActivos(List<Prestamo> prestamos) {
        int count = 0;
        for (Prestamo p : prestamos) {
            if (!p.isDevuelto()) {
                count++;
            }
        }
        return count;
    }

    public void cantidadLibrosDevueltosUltimoMes() {
        // Aquí iría la implementación de cantidadLibrosDevueltosUltimoMes()
    }

    public void listarUsuariosConRetrasos() {
        // Aquí iría la implementación de listarUsuariosConRetrasos()
    }

    // Método para crear un usuario
    public void crearUsuario(Usuario usuario, List<Usuario> usuarios) {
        if (!usuarios.contains(usuario)) {
            usuarios.add(usuario);
            System.out.println("Usuario creado: " + usuario.getNombre());
        } else {
            System.out.println("El usuario ya existe.");
        }
    }

    public void eliminarUsuario(Usuario usuario, List<Usuario> usuarios) {
        if (usuarios.remove(usuario)) {
            System.out.println("Usuario eliminado: " + usuario.getNombre());
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }
}
