package org.fis.grupo3;

public class LibroReservado extends LibroDecorator {

    public LibroReservado(Libro libroBase) {
        super(libroBase);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " [Reservado]";
    }
}
