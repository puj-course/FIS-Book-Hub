public class DevolucionAdapter implements RegistroDevolucion {
    private SistemaExternoDevolucion sistemaExterno;

    public DevolucionAdapter(SistemaExternoDevolucion sistemaExterno) {
        this.sistemaExterno = sistemaExterno;
    }

    @Override
    public void registrar(Prestamo prestamo) {
        String nombre = prestamo.getUsuario().getNombre();
        String titulo = prestamo.getLibro().getTitulo();
        sistemaExterno.procesarDevolucionExterna(nombre, titulo);
        
        // También puedes actualizar el estado local si quieres
        prestamo.registrarDevolucion(); // Esto marcará el estado como "Devuelto"
    }
}
