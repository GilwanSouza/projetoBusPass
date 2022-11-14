package com.br.buspass.classes;

public class Funcionario {

    private String Nome;
    private String CPF;
    private String Senha;
    private int id_funcio;

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

    @Override
    public String toString() {
        return "Funcionario" +
                "\nNome = " + Nome +
                "\nCPF = " + CPF +
                "\nSenha = " + Senha +
                "\nPlaca = " + id_veiculo +
                "\n";
    }

    public void setCPF(int login) {
    }
}