package com.br.buspass.logins;

import java.util.Scanner;

import com.br.buspass.classes.Aluno;
import com.br.buspass.conexao.ConexaoBD;

public class LoginAluno {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Login com matricula: ");
            int matricula = input.nextInt();

            System.out.println("Senha: ");
            String senha = input.nextLine();

            Aluno log_aluno = new Aluno();
            log_aluno.setMatricula(matricula);
            log_aluno.setSenha(senha);

            ConexaoBD.LogarAluno(log_aluno);
        }

    }
}