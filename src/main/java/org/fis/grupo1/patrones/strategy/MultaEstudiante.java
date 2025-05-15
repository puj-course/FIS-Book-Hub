package patterns.strategy;

public class MultaEstudiante implements EstrategiaMulta {

    private static final double TARIFA = 500;
    private static final double RECARGO_PORCENTAJE = 0.20;
    private static final int LIMITE_DIAS_RECARGO = 30;

    @Override
    public double calcular(int diasRetraso) {
        if (diasRetraso <= 0) {
            return 0.0;
        }

        double multa = diasRetraso * TARIFA;

        if (diasRetraso > LIMITE_DIAS_RECARGO) {
            multa += multa * RECARGO_PORCENTAJE;
        }

        return multa;
    }
}
