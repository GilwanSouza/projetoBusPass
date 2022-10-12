package com.br.buspass;
import java.util.Scanner;

import com.br.buspass.conexao.ConexaoBD;

// [RF 004] O sistema deve possibilitar o login para quem for viajar com o motorista com CPF ou matrícula e senha. 

public class LoginFuncionario {
    
    //Login e senha
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String log;
        String senh;

        // 1) Informe o seu login
        System.out.println("Login: ");
        String login = input.nextLine();

        // 2) Informe a sua senha
        System.out.println("Senha: ");
        String senha = input.nextLine();
        // 3) Armazenar em variaveis o login e a senha

        // 4) Verificar se o login e a senha estão corretos
        // Estamos comparando uma instância(objeto) com uma string
        if(login.equals("claudio") && senha.equals("123.456.789-09")){
            System.out.printf("Usuário %s logado com sucesso.", login);
        }else{
            System.out.println("Login ou senha inválidos!");
        }

    LoginF log_fun = new LoginF();
    log_fun.setCpf(login);
    log_fun.setSenha(senha);

    ConexaoBD.LoginFunc(log_fun);


    }
}