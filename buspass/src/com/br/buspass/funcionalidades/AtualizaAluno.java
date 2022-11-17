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
                "\nO que deseja atualizar?\n(1) Para atualizar o nome:\n(2) Para atualizar o número:\n(3) Para atualizar a senha:\n(4) Para voltar ao menu: \n");
        int escolha = input.nextInt();

        if (escolha == 1) {

            System.out.println("\nQual o novo nome? \n");
            String nome_aluno = inputTXT.nextLine();

            System.out.println("\nQual a matricula? \n");
            int matricula = input.nextInt();

            Aluno alunoNome = new Aluno();

            alunoNome.setNome(nome_aluno);
            alunoNome.setMatricula(matricula);

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

            if (ConexaoBD.AtualizarNumeroAluno(alunoNumero)) {
                System.out.println("\nAtualização feita com sucesso! \n");
            } else {
                System.err.println("\nA atualização não foi concluida! \n");
            }

        } else if (escolha == 3) {

            System.out.println("\nDigite a nova senha: \n");
            String senha_aluno = inputTXT.nextLine();

            System.out.println("\nDigite a matricula: \n");
            int matricula = input.nextInt();

            Aluno alunoSenha = new Aluno();
            alunoSenha.setSenha(senha_aluno);
            alunoSenha.setMatricula(matricula);

            if (ConexaoBD.AtualizarSenhaAluno(alunoSenha)) {
                System.out.println("\nAtualização feita com sucesso! \n");
            } else {
                System.err.println("\nA atualização não foi concluida! \n");
            }

        } else if (escolha == 4) {

            MenuAluno.main(args);

        } else {

            System.out.println("\nDigite um valor valído: \n");

        }

        MenuAluno.main(args);

        input.close();
        inputTXT.close();
    }
}
