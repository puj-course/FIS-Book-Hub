package patterns.strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultaAdministradorPrueba {

    private MultaAdministrador multaAdministrador = new MultaAdministrador();

    @Test
    void testCalcular_MultaNormal() {
        assertEquals(900.0, multaAdministrador.calcular(3), 0.01);
        assertEquals(0.0, multaAdministrador.calcular(0), 0.01);
    }

    @Test
    void testCalcular_DiasNegativos() {
        assertEquals(0.0, multaAdministrador.calcular(-5), 0.01);
    }

    @Test
    void testCalcular_ValoresAltos() {
        assertEquals(30000.0, multaAdministrador.calcular(100), 0.01);
    }
}
