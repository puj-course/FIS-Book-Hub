package org.fis.grupo6;

public class LibroAdapter extends Libro {
    private LegacyLibro libroAntiguo;

    public LibroAdapter(LegacyLibro libroAntiguo) {
        this.libroAntiguo = libroAntiguo;
    }

    @Override
    public void registrarLibro() {
        libroAntiguo.registrar();
    }
}
