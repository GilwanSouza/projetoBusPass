package com.br.buspass;

import java.util.Random;
import java.util.Scanner;

import com.br.buspass.classes.Aluno;
import com.br.buspass.classes.Funcionario;
import com.br.buspass.conexao.ConexaoBD;

public class MenuPrincipal {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int usuario = 0;
        int login = 0;
        int cadastro = 0;

        System.out.println("\n Caso deseje fazer login digite 1, caso fazer seu cadastro digite 2:\n");
        usuario = input.nextInt();

        if (usuario == 1) {
            System.out.println(
                    "\n Deseja logar como aluno ou funcionario? \n Digite 1 para logar como aluno e 2 para funcionario");
            login = input.nextInt();

            switch (login) {
                case 1:

                    Aluno logadoAluno = null;
                    try (Scanner entradScanner = new Scanner(System.in);
                        Scanner entTexto = new Scanner(System.in)) {
                        System.out.println("Login com matricula: ");
                        int matricula = entradScanner.nextInt();

                        System.out.println("Senha: ");
                        String senha = entTexto.nextLine();

                        Aluno log_aluno = new Aluno();
                        log_aluno.setMatricula(matricula);
                        log_aluno.setSenha(senha);

                        logadoAluno = ConexaoBD.LogarAluno(log_aluno);

                        entTexto.close();
                        entradScanner.close();

                    } catch (Exception exception) {
                        System.err.println(exception.getMessage());
                    }

                    if (logadoAluno != null) {
                        MenuAluno.main(args);
                    } else {
                        System.out.println("\n Login não existe \n");                      
                    }                                       

                case 2:
                    Funcionario funcioLogado = null;
                    try (Scanner entScanner = new Scanner(System.in)) {
                        System.out.println("\n Login com CPF(com pontos e digitos): \n");
                        String login2 = entScanner.nextLine();

                        System.out.println("\n Senha: \n");
                        String senha = entScanner.nextLine();

                        Funcionario log_fun = new Funcionario();
                        log_fun.setCPF(login2);
                        log_fun.setSenha(senha);

                        funcioLogado = ConexaoBD.LoginFunc(log_fun);

                        entScanner.close();

                    } catch (Exception exception) {
                        System.err.println(exception.getMessage());
                    }

                    if (funcioLogado != null) {
                        MenuFuncionario.main(args);
                    } else {
                        System.out.println("\n Login não existe \n");                      
                    }

            }
        } else if (usuario == 2) {
            System.out
                    .println("\n Se deseja se cadastrar como aluno digite 1, caso seja como funcionario digite 2: \n");
            cadastro = input.nextInt();

            switch (cadastro) {
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

                        entrada.close();

                        if (ConexaoBD.cadastroAluno(aluno)) {
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

                        int id_funcio = random.nextInt(10000);

                        Funcionario funcionario = new Funcionario();
                        funcionario.setNome(Nome);
                        funcionario.setCPF(CPF);
                        funcionario.setSenha(Senha);
                        funcionario.setId_funcio(id_funcio);

                        entrada.close();

                        if (ConexaoBD.cadastroFuncionario(funcionario)) {
                            System.out.println("\n Funcionario cadastrado com sucesso! \n");
                        } else {
                            System.out.println("\n O funcionario não foi cadasdrado! \n");
                        }

                    } catch(Exception exception){
                        System.out.println(exception.getMessage());
                    }
                    break;

                    
            }
        }
        input.close();

    }

}