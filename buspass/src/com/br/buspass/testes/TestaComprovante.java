package com.br.buspass.testes;

import java.util.Scanner;

import com.br.buspass.classes.Pagamento;
import com.br.buspass.conexao.ConexaoBD;

public class TestaComprovante {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n Digite o mês do pagamento? \n");
        String mes = input.nextLine();

        System.out.println("\n Digite a matricula do aluno que fez o pagamento: \n");
        int mat_pagador = input.nextInt();

        System.out.println("\n Digite o dia que o pagamento foi feito: \n");
        String dt_pago = input.nextLine();

        Pagamento pagou = new Pagamento();
        pagou.setMes(mes);
        pagou.setMat_pagador(mat_pagador);
        pagou.setDt_pago(dt_pago);

        ConexaoBD.PagamentoAluno(pagou);

    }
}