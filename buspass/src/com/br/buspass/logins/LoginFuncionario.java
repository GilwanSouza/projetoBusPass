package com.br.buspass.logins;

import java.util.Scanner;

import com.br.buspass.classes.Funcionario;
import com.br.buspass.conexao.ConexaoBD;

// [RF 004] O sistema deve possibilitar o login para quem for viajar com o motorista com CPF ou matrícula e senha. 

public class LoginFuncionario {

    // Login e senha
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Login com CPF(com pontos e digito): ");
            String login = input.nextLine();

            System.out.println("Senha: ");
            String senha = input.nextLine();

            Funcionario log_fun = new Funcionario();
            log_fun.setCPF(login);
            log_fun.setSenha(senha);

            ConexaoBD.LoginFunc(log_fun);
        }

    }
}