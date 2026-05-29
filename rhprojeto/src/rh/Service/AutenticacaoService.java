package rh.Service;

import rh.model.Usuario;
import rh.repository.UsuarioRepository;

public class AutenticacaoService {

    private UsuarioRepository repository;

    public AutenticacaoService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario login(String login, String senha) {

        for (Usuario usuario : repository.listar()) {
            if (usuario.getLogin().equals(login)
                    && usuario.getSenha().equals(senha)) {
                return usuario;
            }
        }

        return null;
    }
}

