package com.br.buspass;

import java.util.Scanner;

import com.br.buspass.classes.Aluno;
import com.br.buspass.classes.Funcionario;
import com.br.buspass.conexao.ConexaoBD;
import com.br.buspass.logins.LoginAluno;

public class menuprincipal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int usuario = 0;
        int login = 0;
        int cadastro = 0;

        System.out.println("\n Caso deseje fazer login digite 1, caso fazer seu cadastro digite 2:\n");
        usuario = input.nextInt();

        if (usuario == 1) {
            System.out.println(
                    "\n Deseja logar como aluno ou funcionario? \n \n Digite 1 para logar como aluno e 2 para funcionario");
            login = input.nextInt();

            switch (usuario) {
                case 1:
                    try (Scanner entradScanner = new Scanner(System.in)) {
                        System.out.println("Login com matricula: ");
                        int matricula = input.nextInt();

                        System.out.println("Senha: ");
                        String senha = input.nextLine();

                        Aluno log_aluno = new Aluno();
                        log_aluno.setMatricula(matricula);
                        log_aluno.setSenha(senha);

                        ConexaoBD.LogarAluno(log_aluno);
                    } catch (Exception exception) {
                        System.err.println(exception.getMessage());
                    }
                    break;
                case 2:
                    try (Scanner entScanner = new Scanner(System.in)) {
                        System.out.println("\n Login com CPF(com pontos e digitos): \n");
                        String login2 = input.nextLine();

                        System.out.println("\n Senha: \n");
                        String senha = input.nextLine();

                        Funcionario log_fun = new Funcionario();
                        log_fun.setCPF(login);
                        log_fun.setSenha(senha);

                        ConexaoBD.LoginFunc(log_fun);
                    } catch (Exception exception) {
                        System.err.println(exception.getMessage());
                    }
            }
        } else if (usuario == 2) {
            System.out
                    .println("\n Se deseja se cadastrar como aluno digite 1, caso seja como funcionario digite 2: \n");
            cadastro = input.nextInt();

            switch (usuario) {
                case 1:
                    try (Scanner entrada = new Scanner(System.in)) {

                        System.out.println("\nInforme seu nome completo: \n");
                        String Nome = entrada.nextLine();

                        System.out.println("\nInforme seu número de celular: \n");
                        String Numero = entrada.nextLine();

                        System.out.println("\nInforme seu CPF: (Com pontos e digito)) \n");
                        String Cpf = entrada.nextLine();

                        System.out.println("\nInforme sua senha: \n");
                        String Senha = entrada.nextLine();

                        System.out.println("\nInforme o número de sua matrícula: \n");
                        int Matricula = entrada.nextInt();

                        Aluno aluno = new Aluno();
                        aluno.setNome(Nome);
                        aluno.setNumero(Numero);
                        aluno.setCpf(Cpf);
                        aluno.setSenha(Senha);
                        aluno.setMatricula(Matricula);

                        ConexaoBD.cadastroAluno(aluno);

                        if (aluno != null) {
                            System.out.println("\n Aluno cadastrado com sucesso! \n");
                        } else {
                            System.err.println("\n O aluno não foi cadasdrado! \n");
                        }
                    } catch (Exception exception) {
                        System.out.println(exception.getMessage());
                    }
                    break;
                case 2:
                    try (Scanner entrada = new Scanner(System.in)) {

                        System.out.println("\nInforme seu nome completo: \n");
                        String Nome = entrada.nextLine();

                        System.out.println("\nInforme seu CPF: \n");
                        String CPF = entrada.nextLine();

                        System.out.print("\nInforme sua senha: \n");
                        String Senha = entrada.nextLine();

                        System.out.println("\nInforme o ID do veiculo que dirige: \n");
                        int id_veiculo = entrada.nextInt();

                        Funcionario funcionario = new Funcionario();
                        funcionario.setNome(Nome);
                        funcionario.setCPF(CPF);
                        funcionario.setSenha(Senha);
                        funcionario.setId_veiculo(id_veiculo);

                        ConexaoBD.cadastroFuncionario(funcionario);

                        if (funcionario != null) {

                            System.out.println("\n Funcionario cadastrado com sucesso! \n");

                        } else {

                            System.out.println("\n O funcionario não foi cadasdrado! \n");

                        }
                    } catch(Exception exception){
                        System.out.println(exception.getMessage());
                    }
            }
        }

        /*
         * if (usuario == 1) {
         * 
         * System.out.println(
         * "\n Deseja logar como aluno ou funcionario? \n \n Digite 1 para logar como aluno e 2 para funcionario"
         * );
         * login = input.nextInt();
         * 
         * if (usuario == 1) {
         * 
         * try (Scanner entradScanner = new Scanner(System.in)) {
         * System.out.println("Login com matricula: ");
         * int matricula = input.nextInt();
         * 
         * System.out.println("Senha: ");
         * String senha = input.nextLine();
         * 
         * Aluno log_aluno = new Aluno();
         * log_aluno.setMatricula(matricula);
         * log_aluno.setSenha(senha);
         * 
         * ConexaoBD.LogarAluno(log_aluno);
         * }
         * 
         * } else if (usuario == 2) {
         * 
         * try (Scanner entScanner = new Scanner(System.in)) {
         * System.out.println("\n Login com CPF(com pontos e digitos): \n");
         * String login2 = input.nextLine();
         * 
         * System.out.println("\n Senha: \n");
         * String senha = input.nextLine();
         * 
         * Funcionario log_fun = new Funcionario();
         * log_fun.setCPF(login);
         * log_fun.setSenha(senha);
         * 
         * ConexaoBD.LoginFunc(log_fun);
         * }
         * 
         * }
         * 
         * } else if (usuario == 2) {
         * 
         * System.out
         * .println("\n Se deseja se cadastrar como aluno digite 1, caso seja como funcionario digite 2: \n"
         * );
         * cadastro = input.nextInt();
         * 
         * if (cadastro == 1) {
         * 
         * try (Scanner entrada = new Scanner(System.in)) {
         * 
         * System.out.println("\nInforme seu nome completo: \n");
         * String Nome = entrada.nextLine();
         * 
         * System.out.println("\nInforme seu número de celular: \n");
         * String Numero = entrada.nextLine();
         * 
         * System.out.println("\nInforme seu CPF: (Com pontos e digito)) \n");
         * String Cpf = entrada.nextLine();
         * 
         * System.out.println("\nInforme sua senha: \n");
         * String Senha = entrada.nextLine();
         * 
         * System.out.println("\nInforme o número de sua matrícula: \n");
         * int Matricula = entrada.nextInt();
         * 
         * Aluno aluno = new Aluno();
         * aluno.setNome(Nome);
         * aluno.setNumero(Numero);
         * aluno.setCpf(Cpf);
         * aluno.setSenha(Senha);
         * aluno.setMatricula(Matricula);
         * 
         * ConexaoBD.cadastroAluno(aluno);
         * 
         * if (aluno != null) {
         * System.out.println("\n Aluno cadastrado com sucesso! \n");
         * } else {
         * System.err.println("\n O aluno não foi cadasdrado! \n");
         * }
         * 
         * } else if (cadastro == 2) {
         * 
         * try (Scanner entrada = new Scanner(System.in)) {
         * 
         * System.out.println("\nInforme seu nome completo: \n");
         * String Nome = entrada.nextLine();
         * 
         * System.out.println("\nInforme seu CPF: \n");
         * String CPF = entrada.nextLine();
         * 
         * System.out.print("\nInforme sua senha: \n");
         * String Senha = entrada.nextLine();
         * 
         * System.out.println("\nInforme o ID do veiculo que dirige: \n");
         * int id_veiculo = entrada.nextInt();
         * 
         * Funcionario funcionario = new Funcionario();
         * funcionario.setNome(Nome);
         * funcionario.setCPF(CPF);
         * funcionario.setSenha(Senha);
         * funcionario.setId_veiculo(id_veiculo);
         * 
         * ConexaoBD.cadastroFuncionario(funcionario);
         * 
         * if (funcionario != null) {
         * 
         * System.out.println("\n Funcionario cadastrado com sucesso! \n");
         * 
         * } else {
         * 
         * System.err.println("\n O funcionario não foi cadasdrado! \n");
         * 
         * }
         * }
         * 
         * }
         * 
         * }
         */

    }

}