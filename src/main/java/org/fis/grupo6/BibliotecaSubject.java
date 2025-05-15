package org.fis.grupo6;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaSubject {
    private List<Observer> observadores = new ArrayList<>();

    public void registrarObservador(Observer obs) {
        observadores.add(obs);
    }

    public void nuevoLibroDisponible(String titulo) {
        System.out.println("Nuevo libro agregado: " + titulo);
        for (Observer obs : observadores) {
            obs.notificar("Nuevo libro disponible: " + titulo);
        }
    }
}
