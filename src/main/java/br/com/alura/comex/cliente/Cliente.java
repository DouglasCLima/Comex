package br.com.alura.comex.cliente;

public class Cliente {
    String nome;
    String cpf;
    String email;
    String profissao;
    String telefone;
    Endereco endereco;

    public void Identificar(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

}
