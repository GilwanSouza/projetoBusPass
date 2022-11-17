package com.br.buspass.classes;

public class Aluno {

    private String Nome = "";
    private String Numero = "";
    private String Cpf = "";
    private String Senha = "";
    private int Matricula = 0;

    public Aluno() {
    }

    public Aluno(String nome, String numero, String cpf, String senha, int matricula) {
        Nome = nome;
        Numero = numero;
        Cpf = cpf;
        Senha = senha;
        Matricula = matricula;
    }

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

}