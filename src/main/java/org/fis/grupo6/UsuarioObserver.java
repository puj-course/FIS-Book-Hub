package org.fis.grupo6;

public class UsuarioObserver extends Usuario implements Observer {
    @Override
    public void notificar(String mensaje) {
        System.out.println(nombre + " recibió notificación: " + mensaje);
    }
}
