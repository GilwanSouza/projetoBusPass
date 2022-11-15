package com.br.buspass.funcionalidades;

import java.util.Scanner;

import com.br.buspass.MenuAluno;
import com.br.buspass.conexao.ConexaoBD;

public class AtualizaAluno {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out
                .println("\n O que deseja atualizar? \n Digite 1 para atualizar o nome, 2 para numero, 3 para CPF, 4 para senha, 5 para Matricula ou 6 para voltar ao menu \n");
        int escolha = input.nextInt();

        while (escolha <= 5) {

            if (escolha == 1) {

                ConexaoBD.AtualizarNomeAluno(null);

            } else if (escolha == 2) {

                ConexaoBD.AtualizarNumeroAluno(null);

            } else if (escolha == 3) {

                ConexaoBD.AtualizarCPFAluno(null);

            } else if (escolha == 4) {

                ConexaoBD.AtualizarSenhaAluno(null);

            } else if (escolha == 5) {

                ConexaoBD.AtualizarMatriculaAluno(null);

            } else if (escolha == 6) {

                MenuAluno.main(args);

            } else {

                System.out.println("\n Infome algum valor valido \n");
                
            }

        }

    }
}
