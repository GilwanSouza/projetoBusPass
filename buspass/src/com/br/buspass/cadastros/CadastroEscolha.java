package com.br.buspass.cadastros;

import java.util.Scanner;

import com.br.buspass.MenuAluno;
import com.br.buspass.compra.Escolha;
import com.br.buspass.conexao.ConexaoBD;

public class CadastroEscolha {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("\nHorários Disponíveis\n");

            ConexaoBD.CompraPassagem();

            System.out.println("\nDigite sua matrícula: \n");
            int mat = input.nextInt();

            System.out.println("\nDigite o ID do horário desejado: \n");
            int num_horario = input.nextInt();

            Escolha hr_viagem = new Escolha(mat, num_horario);

            if (ConexaoBD.EscolhaHorario(hr_viagem)) {
                System.out.println("\nHorário escolhido com sucesso! \n");
            } else {
                System.err.println("\nO horário não foi cadasdrado! \n");
            }

            MenuAluno.main(args);

            input.close();
        }
    }
}