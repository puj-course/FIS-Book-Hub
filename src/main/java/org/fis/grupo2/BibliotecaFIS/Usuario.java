package com.example.usuaario;

public class Usuario {
    public String name;
    public String apellido;
    public int cc;
    public String correo;
    public int telefono;
    public String tipo;

    public Usuario(String name, String apellido, int cc, String correo, int telefono, String tipo) {
        this.name = name;
        this.apellido = apellido;
        this.cc = cc;
        this.correo = correo;
        this.telefono = telefono;
        this.tipo = tipo;
    }
    public void solicitarPrestamo(Libro libro){
        //funcion encargada de solicitar un prestamo
    }
    public Prestamo crearPrestamo(Libro libro) {
    Date fechaPrestamo = new Date(); // hoy
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(fechaPrestamo);

    // lógica diferente según tipo
    if (tipo.equalsIgnoreCase("profesor")) {
        calendar.add(Calendar.DAY_OF_MONTH, 30);
    } else {
        calendar.add(Calendar.DAY_OF_MONTH, 15);
    }

    Date fechaDevolucion = calendar.getTime();
    return new Prestamo(this, libro, fechaPrestamo, fechaDevolucion, "activo");
}
}
