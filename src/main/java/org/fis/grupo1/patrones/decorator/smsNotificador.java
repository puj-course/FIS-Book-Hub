// src/main/patterns/SMSNotificador.java
package patterns;

public class SMSNotificador extends NotificadorDecorator {

    public SMSNotificador(Notificador decorado) {
        super(decorado);
    }

    @Override
    public String enviar(String mensaje) {
        return decorado.enviar(mensaje) + "\nSMS enviado: " + mensaje;
    }
}