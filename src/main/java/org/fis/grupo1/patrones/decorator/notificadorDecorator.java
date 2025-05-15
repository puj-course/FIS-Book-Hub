package patterns;

public abstract class NotificadorDecorator implements Notificador {
    protected Notificador decorado;

    public NotificadorDecorator(Notificador decorado) {
        this.decorado = decorado;
    }
}