package com.br.buspass.classes;

public class Funcionario {

    private String Nome;
    private String CPF;
    private String Senha;
    private int id_funcio;

    public Funcionario() {

    }

    public Funcionario(String nome, String cPF, String senha, int id_funcio, int id_veiculo) {
        Nome = nome;
        CPF = cPF;
        Senha = senha;
        this.id_funcio = id_funcio;
        this.id_veiculo = id_veiculo;
    }

    public int getId_funcio() {
        return id_funcio;
    }

    public void setId_funcio(int id_funcio) {
        this.id_funcio = id_funcio;
    }

    private int id_veiculo;

    public int getId_veiculo() {
        return id_veiculo;
    }

    public void setId_veiculo(int id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public void setCPF(int login) {
    }
}