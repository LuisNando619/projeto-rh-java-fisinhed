package rh.repository;

import rh.model.Presenca;

import java.util.ArrayList;
import java.util.List;

public class PresencaRepository {

    private List<Presenca> presencas = new ArrayList<>();

    public void salvar(Presenca presenca) {
        presencas.add(presenca);
    }

    public List<Presenca> listar() {
        return presencas;
    }
}