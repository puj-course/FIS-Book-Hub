package org.fis.grupo4;

import java.util.List;
import java.util.ArrayList;

public class Bibliotecario {
    // Aplico patron Adapter para que el Bibliotecario pueda usar el adaptador de Administrador para crear usuarios
    private IAdministradorAdapter adminAdapter;

    public void setAdministradorAdapter(IAdministradorAdapter adapter) {
        this.adminAdapter = adapter;
    }

    public void crearUsuarioComoAdmin(Usuario usuario, List<Usuario> usuarios) {
        if (adminAdapter != null) {
            adminAdapter.crearUsuario(usuario, usuarios);
        }
    }
    // Atributo
    private int idBibliotecario;
    
    // Constructor
    public Bibliotecario(int idBibliotecario) {
        this.idBibliotecario = idBibliotecario;
    }
    
    // Getter y Setter
    public int getIdBibliotecario() {
        return idBibliotecario;
    }
    
    public void setIdBibliotecario(int idBibliotecario) {
        this.idBibliotecario = idBibliotecario;
    }
    
    // Métodos
    public void registrarLibro(Libro libro, List<Libro> catalogo) {
    if (!catalogo.contains(libro)) {
        catalogo.add(libro);
        System.out.println("Libro registrado: " + libro.getTitulo());
    } else {
        System.out.println("El libro ya está en el catálogo.");
    }
}
    
    public void verificarRetrasos() {
        // Aquí irá la implementación de verificarRetrasos()
    }
    
    public void registrarDevolucion() {
        // Aquí irá la implementación de registrarDevolucion()
    }
} 