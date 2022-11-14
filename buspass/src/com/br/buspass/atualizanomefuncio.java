package com.br.buspass;

import java.util.Scanner;

import com.br.buspass.conexao.ConexaoBD;

public class atualizanomefuncio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n O que deseja atualizar? \n Digite 1 para atualizar o nome, 2 para CPF ou 3 para senha \n");
        int escolha = input.nextInt();

        while (escolha < 3) {

            if (escolha == 1) {

                ConexaoBD.AtualizarNome(null);

            } else if (escolha == 2) {

                ConexaoBD.AtualizarCPF(null);

            } else if (escolha == 3) {

                ConexaoBD.AtualizarSenha(null);

            } else {
                System.out.println("\n Infome algum valor valido \n");
            }

        }

    }

}
