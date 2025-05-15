package patterns.strategy;

public class CalculadoraMulta {
    private EstrategiaMulta estrategia;

    public void setEstrategia(EstrategiaMulta estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularMulta(int dias) {
        if (estrategia == null) {
            throw new IllegalStateException("La estrategia no ha sido configurada.");
        }
        return estrategia.calcular(dias);
    }
}
