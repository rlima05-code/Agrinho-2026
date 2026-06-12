package com.agro.forte.model;

public class Contato {
    private String nome;
    private String email;
    private String mensagem;

    // Construtores
    public Contato() {}

    public Contato(String nome, String email, String mensagem) {
        this.nome = nome;
        this.email = email;
        this.mensagem = mensagem;
    }

    // Getters e Setters (essenciais para o Java organizar os dados)
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMensagem() { return mensagem; }
    public void setMensagem(String mensagem) { this.mensagem = mensagem; }
}
