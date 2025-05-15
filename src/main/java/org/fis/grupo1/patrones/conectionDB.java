public class GestorConexionBD {
    private static GestorConexionBD instancia;

    private GestorConexionBD() {}

    public static GestorConexionBD getInstancia() {
        if (instancia == null) {
            instancia = new GestorConexionBD();
        }
        return instancia;
    }
}