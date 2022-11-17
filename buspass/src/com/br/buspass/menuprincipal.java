package com.br.buspass;

import java.util.Random;
import java.util.Scanner;

import com.br.buspass.classes.Aluno;
import com.br.buspass.classes.Funcionario;
import com.br.buspass.conexao.ConexaoBD;

public class MenuPrincipal {

    public static void main(String[] args) throws Exception {
        Scanner inputTexto = new Scanner(System.in);
        Scanner inputValor = new Scanner(System.in);
        Random random = new Random();

        int usuario = 0;
        int login = 0;
        int cadastro = 0;

        System.out.println("\n(1) Caso deseje fazer login: \n(2) Caso deseje fazer seu cadastro:\n");
        usuario = inputValor.nextInt();

        if (usuario == 1) {
            System.out.println("\nDeseja logar como aluno ou funcionário? \n(1) Para logar como aluno:\n(2) Para logar como funcionário:\n");
            login = inputValor.nextInt();

            switch (login) {
                case 1:

                    Aluno logadoAluno = null;
                    try {
                        System.out.println("\nLogin com matrícula:\n ");
                        int matricula = inputValor.nextInt();

                        System.out.println("\nSenha:\n ");
                        String senha = inputTexto.nextLine();

                        Aluno log_aluno = new Aluno();
                        log_aluno.setMatricula(matricula);
                        log_aluno.setSenha(senha);

                        logadoAluno = ConexaoBD.LogarAluno(log_aluno);

                    } catch (Exception exception) {
                        System.err.println(exception.getMessage());
                    }

                    if (logadoAluno != null) {
                        MenuAluno.main(args);
                    } else {
                        System.out.println("\nMatrícula ou senha estão inválidos: \n");
                    }

                case 2:
                    Funcionario funcioLogado = null;
                    try {
                        System.out.println("\nLogin com CPF: (Com pontos e digitos): \n");
                        String login2 = inputTexto.nextLine();

                        System.out.println("\nSenha: \n");
                        String senha = inputTexto.nextLine();

                        Funcionario log_fun = new Funcionario();
                        log_fun.setCPF(login2);
                        log_fun.setSenha(senha);

                        funcioLogado = ConexaoBD.LoginFunc(log_fun);

                    } catch (Exception exception) {
                        System.err.println(exception.getMessage());
                    }

                    if (funcioLogado != null) {
                        MenuFuncionario.main(args);
                    } else {
                        System.out.println("\nMatrícula ou senha estão inválidos: \n");
                    }

            }
        } else if (usuario == 2) {
            System.out
                    .println("\n(1) Para se cadastrar como aluno:\n(2) Para se cadastrar como funcionário:\n");
            cadastro = inputValor.nextInt();

            switch (cadastro) {
                case 1:
                    try {

                        System.out.println("\nInforme seu nome completo: \n");
                        String Nome = inputTexto.nextLine();

                        System.out.println("\nInforme seu número de celular: \n");
                        String Numero = inputTexto.nextLine();

                        System.out.println("\nInforme seu CPF: (Com pontos e digito) \n");
                        String Cpf = inputTexto.nextLine();

                        System.out.println("\nInforme sua senha: \n");
                        String Senha = inputTexto.nextLine();

                        System.out.println("\nInforme o número de sua matrícula: \n");
                        int Matricula = inputValor.nextInt();

                        Aluno aluno = new Aluno();
                        aluno.setNome(Nome);
                        aluno.setNumero(Numero);
                        aluno.setCpf(Cpf);
                        aluno.setSenha(Senha);
                        aluno.setMatricula(Matricula);

                        if (ConexaoBD.cadastroAluno(aluno)) {
                            System.out.println("\nAluno cadastrado com sucesso! \n");
                        } else {
                            System.err.println("\nO aluno não foi cadasdrado! \n");
                        }
                    } catch (Exception exception) {
                        System.out.println(exception.getMessage());
                    }
                    break;
                case 2:
                    try {

                        System.out.println("\nInforme seu nome completo: \n");
                        String Nome = inputTexto.nextLine();

                        System.out.println("\nInforme seu CPF: (Com pontos e digito) \n");
                        String CPF = inputTexto.nextLine();

                        System.out.print("\nInforme sua senha: \n");
                        String Senha = inputTexto.nextLine();

                        int id_funcio = random.nextInt(10000);

                        Funcionario funcionario = new Funcionario();
                        funcionario.setNome(Nome);
                        funcionario.setCPF(CPF);
                        funcionario.setSenha(Senha);
                        funcionario.setId_funcio(id_funcio);

                        if (ConexaoBD.cadastroFuncionario(funcionario)) {
                            System.out.println("\nFuncionário cadastrado com sucesso! \n");
                        } else {
                            System.out.println("\nO funcionário não foi cadasdrado! \n");
                        }

                    } catch (Exception exception) {
                        System.out.println(exception.getMessage());
                    }
                    break;

            }
        }
        inputValor.close();
        inputTexto.close();
    }

}