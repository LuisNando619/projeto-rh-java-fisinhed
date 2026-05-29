package rh.service;

import rh.model.FolhaPagamento;
import rh.model.Funcionario;

public class FolhaPagamentoService {

    public FolhaPagamento gerarFolha(int id, Funcionario funcionario) {

        double salarioBase = funcionario.getSalarioBase();

        double descontoFaltas =
                (salarioBase / 30) * funcionario.getFaltas();

        double valorHora = salarioBase / 220;

        double valorHorasExtras =
                funcionario.getHorasExtras() * (valorHora * 1.5);

        double salarioFinal =
                salarioBase - descontoFaltas + valorHorasExtras;

        return new FolhaPagamento(
                id,
                funcionario,
                descontoFaltas,
                valorHorasExtras,
                salarioFinal
        );
    }
}
