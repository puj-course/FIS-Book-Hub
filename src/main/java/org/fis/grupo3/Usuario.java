package org.fis.grupo3;

public class Usuario {
    protected int id;
    protected String nombre;
    protected String correo;
    protected String tipoUsuario; // Estudiante, Bibliotecario, Administrador

    public Usuario(int id, String nombre, String correo, String tipoUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.tipoUsuario = tipoUsuario;
    }

    public void autenticar() {
        System.out.println("Autenticando usuario: " + nombre);
    }

    public void solicitarPrestamo(Libro libro) {
        System.out.println(nombre + " ha solicitado el libro '" + libro.getTitulo() + "'");
    }
}
