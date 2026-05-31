package rh.Repository;

import rh.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {

    private List<Usuario> usuarios = new ArrayList<>();

    public void salvar(Usuario usuario) {
        usuarios.add(usuario);
    }


    public List<Usuario> listar() {
        return usuarios;
    }


    public Usuario buscarPorId(int id) {

        for (Usuario usuario : usuarios) {

            if (usuario.getId() == id) {
                return usuario;
            }

        }

        return null;
    }


    public void remover(int id) {

        usuarios.removeIf(usuario -> usuario.getId() == id);

    }
}
