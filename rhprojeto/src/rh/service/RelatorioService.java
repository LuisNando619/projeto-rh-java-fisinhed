package rh.service;

import rh.model.FolhaPagamento;
import rh.model.Funcionario;

import java.util.List;

public class RelatorioService {

    public void listarFuncionarios(List<Funcionario> funcionarios) {

        System.out.println("===== FUNCIONÁRIOS =====");

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }

    public void listarFaltosos(List<Funcionario> funcionarios) {

        System.out.println("===== FALTAS =====");

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getFaltas() > 0) {
                System.out.println(funcionario);
            }
        }
    }

    public void totalFolha(List<FolhaPagamento> folhas) {

        double total = 0;

        for (FolhaPagamento folha : folhas) {
            total += folha.getSalarioFinal();
        }

        System.out.println("Total folha salarial: R$ " + total);
    }
}