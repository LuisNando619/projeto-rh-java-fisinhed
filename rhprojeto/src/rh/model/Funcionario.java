package rh.model;

import rh.enums.*;

public class Funcionario implements Identificavel {

    private int id;
    private String nome;
    private String cpf;
    private Cargo cargo;
    private double salarioBase;
    private int faltas;
    private double horasExtras;

    public Funcionario(int id, String nome, String cpf, Cargo cargo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salarioBase = cargo.getSalarioBase();
    }

    @Override
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getFaltas() {
        return faltas;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void adicionarFalta() {
        this.faltas++;
    }

    public void adicionarHorasExtras(double horas) {
        this.horasExtras += horas;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cargo=" + cargo.getDeclaringClass().getName() +
                ", salarioBase=" + salarioBase +
                ", faltas=" + faltas +
                ", horasExtras=" + horasExtras +
                '}';
    }
}
