package patterns.strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraPrueba {

    private CalculadoraMulta calculadora = new CalculadoraMulta();
    private MultaEstudiante multaEstudiante = new MultaEstudiante();
    private MultaAdministrador multaAdministrador = new MultaAdministrador();

    @Test
    void testCalcularMulta_ConMultaEstudiante() {
        calculadora.setEstrategia(multaEstudiante);
        assertEquals(5000.0, calculadora.calcularMulta(10), 0.01);
    }

    @Test
    void testCalcularMulta_ConMultaAdministrador() {
        calculadora.setEstrategia(multaAdministrador);
        assertEquals(1500.0, calculadora.calcularMulta(5), 0.01);
    }

    @Test
    void testCalcularMulta_SinEstrategia() {
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            calculadora.calcularMulta(10);
        });
        assertEquals("La estrategia no ha sido configurada.", exception.getMessage());
    }

    @Test
    void testCalcularMulta_DiasNegativos() {
        calculadora.setEstrategia(multaEstudiante);
        assertEquals(0.0, calculadora.calcularMulta(-5), 0.01);
    }
}
