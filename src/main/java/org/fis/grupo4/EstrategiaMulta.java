package org.fis.grupo4;

// Interfaz de estrategia para aplicar el patron Strategy
// Sirve para calcular la multa de un usuario segun el tipo de usuario
public interface EstrategiaMulta {
    double calcularMulta(int diasRetraso);
}