
package patterns;

public class EmailNotificador implements Notificador {

    @Override
    public String enviar(String mensaje) {
        return "Email enviado: " + mensaje;
    }
}