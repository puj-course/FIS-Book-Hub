package org.fis.grupo4;

public class MultaPremium implements EstrategiaMulta {
    @Override
    public double calcularMulta(int diasRetraso) {
        return diasRetraso * 2000; // $2000 por día de retraso
    }
} 