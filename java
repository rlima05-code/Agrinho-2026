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
package com.agro.forte.controller;

import com.agro.forte.model.Contato;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contato") // Define a URL que o HTML vai chamar
public class ContatoController {

    @PostMapping
    public String receberContato(@RequestBody Contato contato) {
        // Aqui o Java processa os dados (pode salvar no banco, mandar e-mail, etc.)
        System.out.println("Novo contato recebido do produtor: " + contato.getNome());
        
        // Retorna uma mensagem de sucesso para o site
        return "Obrigado, " + contato.getNome() + "! Sua mensagem sobre Agro Sustentável foi recebida.";
    async function enviarFormulario() {
    const dados = {
        nome: document.getElementById('nome').value,
        email: document.getElementById('email').value,
        mensagem: document.getElementById('mensagem').value
    };

    // O fetch envia os dados para o servidor Java rodando na sua máquina
    const resposta = await fetch('http://localhost:8080/api/contato', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(dados)
    });

    const texto = await resposta.text();
    alert(texto); // Mostra a resposta que o Java enviou
}

