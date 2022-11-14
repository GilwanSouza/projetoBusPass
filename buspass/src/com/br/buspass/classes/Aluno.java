package com.br.buspass.classes;

public class Aluno {
    
    private String Nome;
    private String Numero;
    private String Cpf;
    private String Senha;
    private int Matricula;
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public String getSenha() {
        return Senha;
    }
    
    public void setSenha(String senha) {
        Senha = senha;
    }

    public int getMatricula() {
        return Matricula;
    }

    public int setMatricula(int matricula) {
        return Matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno"       +
        "\n Nome = "            + Nome       + 
        "\n Número = "          + Numero     + 
        "\n CPF = "             + Cpf        + 
        "\n Senha = "           + Senha      + 
        "\n Matrícula = "       + Matricula  +   
        "\n";
    }
}