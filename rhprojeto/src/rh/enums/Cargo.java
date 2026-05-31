package rh.model;

public enum Cargo {

    DESENVOLVEDOR(5000),
    GERENTE(8000),
    RH(4000);

    private final double salarioBase;

    Cargo(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}


