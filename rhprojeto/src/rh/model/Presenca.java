package rh.model;

import rh.model.StatusPresenca;

import java.time.LocalDate;


public class Presenca implements Identificavel {
    private int id;
    private Funcionario funcionario;
    private LocalDate data;
    private StatusPresenca status;
    private double horasExtras;

    public Presenca(int id, Funcionario funcionario, LocalDate data,
                    StatusPresenca status, double horasExtras) {
        this.id = id;
        this.funcionario = funcionario;
        this.data = data;
        this.status = status;
        this.horasExtras = horasExtras;
    }

    @Override
    public int getId() {
        return id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public StatusPresenca getStatus() {
        return status;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    @Override
    public String toString() {
        return "Presenca{" +
                "funcionario=" + funcionario.getNome() +
                ", data=" + data +
                ", status=" + status +
                ", horasExtras=" + horasExtras +
                '}';
    }
}
