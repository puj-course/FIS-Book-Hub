import java.util.ArrayList;
import java.util.List;

public class SistemaBiblioteca {
    private static SistemaBiblioteca instancia;

    private List<Libro> libros;
    private List<Prestamo> prestamos;
    private List<Usuario> usuarios;

    private SistemaBiblioteca() {
        libros = new ArrayList<>();
        prestamos = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public static synchronized SistemaBiblioteca getInstancia() {
        if (instancia == null) {
            instancia = new SistemaBiblioteca();
        }
        return instancia;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
