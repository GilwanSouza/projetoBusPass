package com.br.buspass.cadastros;

import java.util.Scanner;

import com.br.buspass.classes.Pagamento;
import com.br.buspass.conexao.ConexaoBD;

public class CadastroComprovante {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n Digite o mês do pagamento? \n");
        String mes = input.nextLine();

        System.out.println("\n Digite a matricula do aluno que fez o pagamento: \n");
        int mat_pagador = input.nextInt();

        System.out.println("\n Digite o dia que o pagamento foi feito: \n");
        String dt_pago = input.nextLine();

        Pagamento pagou = new Pagamento(mes, mat_pagador, dt_pago);

        if (ConexaoBD.PagamentoAluno(pagou)) {
            System.out.println("\n Pagamento do aluno cadastrado com sucesso! \n");
        } else {
            System.err.println("\n O pagamento do aluno não foi cadasdrado! \n");
        }
    }
}