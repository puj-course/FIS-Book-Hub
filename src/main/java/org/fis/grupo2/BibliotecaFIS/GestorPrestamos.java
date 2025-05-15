package com.example.prestamo;

import java.util.ArrayList;
import java.util.List;

public class GestorPrestamos {

    // Lista de observadores que serán notificados cuando se registre un préstamo
    private List<ObservadorPrestamo> observadores;

    public GestorPrestamos() {
        this.observadores = new ArrayList<>();
    }

    // Método para agregar observadores al sistema
    public void agregarObservador(ObservadorPrestamo observador) {
        observadores.add(observador);
    }

    // Método para registrar un préstamo
    public void registrarPrestamo(Prestamo prestamo) {
        // Aquí podrías guardar el préstamo en una base de datos o lista global

        System.out.println("Préstamo registrado: " + prestamo.libro.titulo + " para " + prestamo.usuario.name);
        
        // Notificar a todos los observadores
        notificarObservadores(prestamo);
    }

    // Notificar a todos los observadores registrados
    private void notificarObservadores(Prestamo prestamo) {
        for (ObservadorPrestamo observador : observadores) {
            observador.actualizar(prestamo);
        }
    }
}
