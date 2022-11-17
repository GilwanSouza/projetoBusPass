package com.br.buspass.funcionalidades;

import java.util.Scanner;

import com.br.buspass.MenuAluno;
import com.br.buspass.conexao.ConexaoBD;

public class AtualizaAluno {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("\nO que deseja atualizar?\n(1) Para atualizar o nome:\n(2) Para atualizar o número:\n(3) Para atualizar o CPF:\n(4) Para atualizar a senha:\n(5) Para atualizar a matrícula:\n(6) Para voltar ao menu: \n");
        int escolha = input.nextInt();

        while (escolha <= 5) {

            switch (escolha) {
                case 1:
                ConexaoBD.AtualizarNomeAluno(null);

                    break;
                    
                case 2:
                ConexaoBD.AtualizarNumeroAluno(null);

                    break;

                case 3:
                ConexaoBD.AtualizarCPFAluno(null);

                    break;

                case 4:
                ConexaoBD.AtualizarSenhaAluno(null);

                    break;

                case 5:
                ConexaoBD.AtualizarMatriculaAluno(null);

                    break;

                case 6:
                MenuAluno.main(args);

                    break;

                case 7:
                System.out.println("\n Infome algum valor valido \n");

            }

        }
        input.close();
    }
}
