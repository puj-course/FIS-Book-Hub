package patterns.strategy;

public class CalculadoraMulta {
    private EstrategiaMulta estrategia;

    public void setEstrategia(EstrategiaMulta estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularMulta(int dias) {
        return estrategia.calcular(dias);
    }
}