package org.fis.grupo4;

public class MultaBasica implements EstrategiaMulta {
    @Override
    public double calcularMulta(int diasRetraso) {
        return diasRetraso * 1000; // $1000 por día de retraso
    }
} 