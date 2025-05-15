package patterns.strategy;

public class MultaAdministrador implements EstrategiaMulta {

    private static final double TARIFA = 300;

    @Override
    public double calcular(int diasRetraso) {
        if (diasRetraso <= 0) {
            return 0.0;
        }

        return diasRetraso * TARIFA;
    }
}
