package org.fis.grupo3;

public class Bibliotecario extends Usuario{
    public Bibliotecario(int id, String nombre, String correo) {
        super(id, nombre, correo, "Bibliotecario");
    }

    public void registrarDevolucion(Prestamo prestamo) {
        //implementacion
    }

    public void verificarRetrasos(){
        //implementacion
    }

    public void registrarlibro(){
        //implementacion
    }
}
