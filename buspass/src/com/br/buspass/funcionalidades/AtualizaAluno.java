package com.br.buspass.funcionalidades;

import java.util.Scanner;

import com.br.buspass.MenuAluno;
import com.br.buspass.classes.Aluno;
import com.br.buspass.conexao.ConexaoBD;

public class AtualizaAluno {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Scanner inputTXT = new Scanner(System.in);

        System.out.println(
                "\nO que deseja atualizar?\n(1) Para atualizar o nome:\n(2) Para atualizar o número:\n(3) Para atualizar o CPF:\n(4) Para atualizar a senha:\n(5) Para atualizar a matrícula:\n(6) Para voltar ao menu: \n");
        int escolha = input.nextInt();

        if (escolha == 1) {

            System.out.println("\n Qual o novo nome? \n");
            String nome_aluno = inputTXT.nextLine();

            System.out.println("\nQual a matricula? \n");
            int matricula = input.nextInt();

            Aluno alunoNome = new Aluno();

            alunoNome.setNome(nome_aluno);
            alunoNome.setMatricula(matricula);

            ConexaoBD.AtualizarNomeAluno(alunoNome);

            if (ConexaoBD.AtualizarNomeAluno(alunoNome)) {
                System.out.println("\nAtualização feita com sucesso! \n");
            } else {
                System.err.println("\nA atualização não foi concluida! \n");
            }

        } else if (escolha == 2) {

            System.out.println("\nDigite o novo numero: \n");
            String num_aluno = inputTXT.nextLine();

            System.out.println("\nDigite a matricula: \n");
            int matricula = input.nextInt();

            Aluno alunoNumero = new Aluno();

            alunoNumero.setNumero(num_aluno);
            alunoNumero.setMatricula(matricula);

            ConexaoBD.AtualizarNomeAluno(alunoNumero);

            if (ConexaoBD.AtualizarCPFAluno(alunoNumero)) {
                System.out.println("\nAtualização feita com sucesso! \n");
            } else {
                System.err.println("\nA atualização não foi concluida! \n");
            }

        } else if (escolha == 3) {

            System.out.println("\nDigite o novo CPF: \n");
            String cpf_aluno = inputTXT.nextLine();

            System.out.println("\nDigite a matricula: \n");
            int matricula = input.nextInt();

            Aluno alunoCpf = new Aluno();

            alunoCpf.setCpf(cpf_aluno);
            alunoCpf.setMatricula(matricula);

            ConexaoBD.AtualizarNomeAluno(alunoCpf);

            if (ConexaoBD.AtualizarCPFAluno(alunoCpf)) {
                System.out.println("\nAtualização feita com sucesso! \n");
            } else {
                System.err.println("\nA atualização não foi concluida! \n");
            }

        } else if (escolha == 4) {

            System.out.println("\nDigite a nova senha: \n");
            String senha_aluno = inputTXT.nextLine();

            System.out.println("\nDigite a matricula: \n");
            int matricula = input.nextInt();

            Aluno alunoSenha = new Aluno();
            alunoSenha.setSenha(senha_aluno);
            alunoSenha.setMatricula(matricula);
            ConexaoBD.AtualizarNomeAluno(alunoSenha);

            if (ConexaoBD.AtualizarSenhaAluno(alunoSenha)) {
                System.out.println("\nAtualização feita com sucesso! \n");
            } else {
                System.err.println("\nA atualização não foi concluida! \n");
            }

        } else if (escolha == 5) {

            System.out.println("\nDigite a nova matricula: \n");
            int matricula_aluno = inputTXT.nextInt();

            System.out.println("\nDigite a matricula: \n");
            int matricula = input.nextInt();

            Aluno alunoMatricula = new Aluno();
            alunoMatricula.setMatricula(matricula_aluno);
            alunoMatricula.setMatricula(matricula);
            ConexaoBD.AtualizarNomeAluno(alunoMatricula);

            if (ConexaoBD.AtualizarMatriculaAluno(alunoMatricula)) {
                System.out.println("\nAtualização feita com sucesso! \n");
            } else {
                System.err.println("\nA atualização não foi concluida! \n");
            }

        } else if (escolha == 6) {

            MenuAluno.main(args);

        } else if (escolha == 7) {

            System.out.println("\n Infome algum valor valido \n");

        } else {

            System.out.println("\n Digite um valor valido: \n");

        }
        input.close();
        inputTXT.close();
    }
}
