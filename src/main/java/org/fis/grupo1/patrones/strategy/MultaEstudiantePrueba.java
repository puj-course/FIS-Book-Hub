package patterns.strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultaEstudiantePrueba {

    private MultaEstudiante multaEstudiante = new MultaEstudiante();

    @Test
    void testCalcular_SinRecargo() {
        assertEquals(2500.0, multaEstudiante.calcular(5), 0.01);
        assertEquals(15000.0, multaEstudiante.calcular(30), 0.01);
    }

    @Test
    void testCalcular_ConRecargo() {
        double esperado = (35 * 500) * 1.20;
        assertEquals(esperado, multaEstudiante.calcular(35), 0.01);
    }

    @Test
    void testCalcular_DiasCero() {
        assertEquals(0.0, multaEstudiante.calcular(0), 0.01);
    }

    @Test
    void testCalcular_DiasNegativos() {
        assertEquals(0.0, multaEstudiante.calcular(-10), 0.01);
    }

    @Test
    void testCalcular_LimiteSinRecargo() {
        assertEquals(15000.0, multaEstudiante.calcular(30), 0.01);
    }

    @Test
    void testCalcular_LimiteConRecargo() {
        double esperado = (31 * 500) * 1.20;
        assertEquals(esperado, multaEstudiante.calcular(31), 0.01);
    }
}
