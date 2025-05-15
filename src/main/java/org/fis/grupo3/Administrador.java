import java.util.ArrayList;
import java.util.List;

public class Administrador extends Usuario {
    private static Administrador instancia;

    private Administrador(int id, String nombre, String correo) {
        super(id, nombre, correo, "Administrador");
    }

    public static synchronized Administrador getInstancia(int id, String nombre, String correo) {
        if (instancia == null) {
            instancia = new Administrador(id, nombre, correo);
        }
        return instancia;
    }

    public void generarReportes() {
        System.out.println("Generando reportes de libros prestados...");
        int total = SistemaBiblioteca.getInstancia().getPrestamos().size();
        System.out.println("Total de préstamos registrados: " + total);
    }

    public void analizarDatos() {
        System.out.println("Analizando datos de uso de la biblioteca...");
        System.out.println("Cantidad de libros disponibles: " + cantidadLibrosDisponibles());
        System.out.println("Cantidad de préstamos activos: " + cantidadPrestamosActivos());
        System.out.println("Libros devueltos en el último mes: " + cantidadLibrosDevueltosUltimoMes());
        System.out.println("Usuarios con retrasos: " + listarUsuariosConRetrasos());
    }

    public int cantidadLibrosDisponibles() {
        int contador = 0;
        for (Libro libro : SistemaBiblioteca.getInstancia().getLibros()) {
            if (libro.isDisponible()) contador++;
        }
        return contador;
    }

    public int cantidadPrestamosActivos() {
        int contador = 0;
        for (Prestamo p : SistemaBiblioteca.getInstancia().getPrestamos()) {
            if (!p.isDevuelto()) contador++;
        }
        return contador;
    }

    public int cantidadLibrosDevueltosUltimoMes() {
        int contador = 0;
        for (Prestamo p : SistemaBiblioteca.getInstancia().getPrestamos()) {
            if (p.devueltoEnUltimoMes()) contador++;
        }
        return contador;
    }

    public List<String> listarUsuariosConRetrasos() {
        List<String> usuarios = new ArrayList<>();
        for (Prestamo p : SistemaBiblioteca.getInstancia().getPrestamos()) {
            if (p.estaAtrasado()) {
                String nombre = p.getUsuario().getNombre();
                if (!usuarios.contains(nombre)) {
                    usuarios.add(nombre);
                }
            }
        }
        return usuarios;
    }
}
