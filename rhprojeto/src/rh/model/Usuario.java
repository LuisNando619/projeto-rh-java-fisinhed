package rh.model;

import rh.model.NivelAcesso;

public class Usuario implements Identificavel {

    private int id;
    private String login;
    private String senha;
    private NivelAcesso nivelAcesso;

    public Usuario(int id, String login, String senha, NivelAcesso nivelAcesso) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    @Override
    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public NivelAcesso getNivelAcesso() {
        return nivelAcesso;
    }
}