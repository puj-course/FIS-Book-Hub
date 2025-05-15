package org.fis.grupo3;

public abstract class LibroDecorator extends Libro {
    protected Libro libroBase;

    public LibroDecorator(Libro libroBase) {
        super(libroBase.getTitulo(), libroBase.getAutor(), libroBase.getEstado());
        this.libroBase = libroBase;
    }

    @Override
    public String getDescripcion() {
        return libroBase.getDescripcion();
    }
}
