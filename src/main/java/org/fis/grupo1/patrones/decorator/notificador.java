interface EstrategiaMulta {
    double calcular(int dias);
}


class MultaProfesor implements EstrategiaMulta {
    public double calcular(int dias) { return dias * 300; }
}
class MultaEstudiante implements EstrategiaMulta {
    public double calcular(int dias) { return dias * 500; }
}

class CalculadoraMulta {
    private EstrategiaMulta estrategia;
    public void setEstrategia(EstrategiaMulta e) { this.estrategia = e; }
    public double calcular(int dias) { return estrategia.calcular(dias); }
}