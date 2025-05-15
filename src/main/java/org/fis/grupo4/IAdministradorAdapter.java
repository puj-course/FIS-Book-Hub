package org.fis.grupo4;

import java.util.List;

public interface IAdministradorAdapter {
    void crearUsuario(Usuario usuario, List<Usuario> usuarios);
    void eliminarUsuario(Usuario usuario, List<Usuario> usuarios);
}