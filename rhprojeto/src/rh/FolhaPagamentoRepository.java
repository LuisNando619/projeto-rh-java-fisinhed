package rh.repository;

import rh.model.FolhaPagamento;

import java.util.ArrayList;
import java.util.List;

public class FolhaPagamentoRepository {

    private List<FolhaPagamento> folhas = new ArrayList<>();

    public void salvar(FolhaPagamento folha) {
        folhas.add(folha);
    }

    public List<FolhaPagamento> listar() {
        return folhas;
    }
}