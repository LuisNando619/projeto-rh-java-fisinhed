package rh.repository;

import rh.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {

    private List<Usuario> usuarios = new ArrayList<>();

    // Salvar usuário
    public void salvar(Usuario usuario) {
        usuarios.add(usuario);
    }

    // Listar usuários
    public List<Usuario> listar() {
        return usuarios;
    }

    // Buscar usuário por ID
    public Usuario buscarPorId(int id) {

        for (Usuario usuario : usuarios) {

            if (usuario.getId() == id) {
                return usuario;
            }

        }

        return null;
    }

    // Remover usuário
    public void remover(int id) {

        usuarios.removeIf(usuario -> usuario.getId() == id);

    }
}