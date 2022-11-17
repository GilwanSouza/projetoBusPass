package com.br.buspass.funcionalidades;

import java.util.Scanner;

import com.br.buspass.conexao.ConexaoBD;

public class AtualizaFuncio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out
                .println("\nO que deseja atualizar?\n(1) Para atualizar o nome:\n(2) Para atualizar o CPF:\n(3) Para atualizar a senha \n");
        int escolha = input.nextInt();

        while (escolha <= 5) {

            if (escolha == 1) {

                ConexaoBD.AtualizarNomeFuncio(null);

            } else if (escolha == 2) {

                ConexaoBD.AtualizarCPFFuncio(null);

            } else if (escolha == 3) {

                ConexaoBD.AtualizarSenhaFuncio(null);

            } else if (escolha == 4) {

                ConexaoBD.AtualizarIDVelFuncio(null);

            } else {
                System.out.println("\nInfome algum valor valido: \n");
            }

        }
        input.close();
    }

}
