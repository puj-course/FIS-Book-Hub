package org.fis.grupo4;

import java.util.List;
import java.util.ArrayList;

public class AdministradorAdapter implements IAdministradorAdapter {
    private Administrador administrador;

    public AdministradorAdapter() {
        this.administrador = Administrador.getInstancia();
    }

    @Override
    public void crearUsuario(Usuario usuario, List<Usuario> usuarios) {
        administrador.crearUsuario(usuario, usuarios);
    }

    @Override
    public void eliminarUsuario(Usuario usuario, List<Usuario> usuarios) {
        administrador.eliminarUsuario(usuario, usuarios);
    }
} 