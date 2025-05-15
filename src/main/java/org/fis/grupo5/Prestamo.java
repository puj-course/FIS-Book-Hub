// ===================
// CLASE PRESTAMO
// ===================
class Prestamo {
    Usuario usuario;
    Libro libro;
    Date fechaPrestamo;
    Date fechaDevolucionEstimada;
    String estado;

    public Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaPrestamo = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(fechaPrestamo);
        cal.add(Calendar.DAY_OF_MONTH, 15);
        this.fechaDevolucionEstimada = cal.getTime();
        this.estado = "Activo";
    }

    public boolean verificarRetraso() {
        return usuario.tieneRetraso(fechaPrestamo, fechaDevolucionEstimada);
    }
}
