package rh.Repository;

import rh.model.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepository {

    private List<Funcionario> funcionarios = new ArrayList<>();

    public void salvar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public List<Funcionario> listar() {
        return funcionarios;
    }

    public Funcionario buscarPorId(int id) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() == id) {
                return funcionario;
            }
        }
        return null;
    }

    public void remover(int id) {
        funcionarios.removeIf(f -> f.getId() == id);
    }
}
