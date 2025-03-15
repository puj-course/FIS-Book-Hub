package prueba;
extends administrador; 
public class bibliotecario {
	private int idBibliotecario;

    public void Bibliotecario(int idBibliotecario) {
        this.idBibliotecario = idBibliotecario;
    }

    public void registrarLibro(Libro libro) {
       libro.registrarLibro();   
    }

    public void verificarRetrasos() {
       prestamo.verificarRetraso();
    }

    public void registrarDevolucion(Prestamo prestamo) {
        prestamo.registrarDevolucion();
    }

   

}