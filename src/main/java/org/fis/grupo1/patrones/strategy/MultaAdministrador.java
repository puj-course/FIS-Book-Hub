package patterns.strategy;

public class MultaAdministrador implements EstrategiaMulta {
    @Override
    public double calcular(int diasRetraso) {
        return diasRetraso * 300;
    }
}