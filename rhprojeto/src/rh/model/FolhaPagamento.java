package rh.model;

public class FolhaPagamento implements Identificavel {

    private int id;
    private Funcionario funcionario;
    private double salarioBase;
    private double descontoFaltas;
    private double valorHorasExtras;
    private double salarioFinal;

    public FolhaPagamento(int id, Funcionario funcionario,
                          double descontoFaltas,
                          double valorHorasExtras,
                          double salarioFinal) {

        this.id = id;
        this.funcionario = funcionario;
        this.salarioBase = funcionario.getSalarioBase();
        this.descontoFaltas = descontoFaltas;
        this.valorHorasExtras = valorHorasExtras;
        this.salarioFinal = salarioFinal;
    }

    @Override
    public int getId() {
        return id;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "FolhaPagamento{" +
                "funcionario=" + funcionario.getNome() +
                ", salarioBase=" + salarioBase +
                ", descontoFaltas=" + descontoFaltas +
                ", valorHorasExtras=" + valorHorasExtras +
                ", salarioFinal=" + salarioFinal +
                '}';
    }
}