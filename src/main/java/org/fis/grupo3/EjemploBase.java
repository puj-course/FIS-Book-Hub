package org.fis.grupo3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Administrador admin = Administrador.getInstancia(1, "Admin", "admin@bookhub.com");
        Bibliotecario bibliotecario = new Bibliotecario(2, "Mario", "mario@bookhub.com");

        List<Libro> libros = new ArrayList<>();
        List<Prestamo> prestamos = new ArrayList<>();

        while (true) {
            System.out.println("\n Bienvenido a FIS BookHub");
            System.out.println("1. Registrar libro");
            System.out.println("2. Crear préstamo");
            System.out.println("3. Registrar devolución");
            System.out.println("4. Verificar retrasos");
            System.out.println("5. Reporte del administrador");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Estado (disponible/prestado): ");
                    String estado = scanner.nextLine();

                    Libro libro = new Libro(titulo, autor, estado);
                    bibliotecario.registrarLibro(libro);
                    libros.add(libro);
                    break;

                case 2:
                    if (libros.isEmpty()) {
                        System.out.println(" No hay libros registrados.");
                        break;
                    }
                    Usuario usuario = new Usuario(3, "Juan", "juan@correo.com", "Estudiante");
                    Libro libroPrestamo = libros.get(0);
                    LocalDate hoy = LocalDate.now();
                    Prestamo prestamo = new Prestamo(prestamos.size() + 1, usuario, libroPrestamo, hoy, hoy.plusDays(7));
                    prestamos.add(prestamo);
                    System.out.println(" Préstamo creado exitosamente para " + libroPrestamo.getTitulo());
                    break;

                case 3:
                    if (prestamos.isEmpty()) {
                        System.out.println(" No hay préstamos registrados.");
                        break;
                    }
                    Prestamo p = prestamos.get(0);
                    bibliotecario.registrarDevolucion(p);
                    break;

                case 4:
                    bibliotecario.verificarRetrasos(prestamos);
                    break;

                case 5:
                    System.out.println("Libros disponibles: " + admin.cantidadLibrosDisponibles(libros));
                    System.out.println("Préstamos activos: " + admin.cantidadPrestamosActivos(prestamos));
                    System.out.println("Libros devueltos este mes: " + admin.cantidadLibrosDevueltosUltimoMes(prestamos));
                    System.out.println("Usuarios con retrasos: " + admin.listarUsuariosConRetrasos(prestamos));
                    break;

                case 6:
                    System.out.println("Hasta pronto!");
                    return;

                default:
                    System.out.println(" Opción inválida. Intente nuevamente.");
            }
        }
    }
}
