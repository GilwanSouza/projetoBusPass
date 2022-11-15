package com.br.buspass.cadastros;

import java.util.Scanner;

import com.br.buspass.compra.Escolha;
import com.br.buspass.conexao.ConexaoBD;


public class CadastroEscolha {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("\nHorarios Disponiveis\n");
            
            ConexaoBD.CompraPassagem();

            System.out.println("\nDigite sua matricula: \n");
            int mat = input.nextInt();

            System.out.println("\nDigite o ID do horario desejado: \n");
            int num_horario = input.nextInt();

            Escolha hr_viagem = new Escolha(mat, num_horario);

            if (ConexaoBD.EscolhaHorario(hr_viagem)) {
                System.out.println("\n Horario escolhido com sucesso! \n");
            } else {
                System.err.println("\n O(s) horário(s) não foram cadasdrado(s)! \n");
            }
        }
    }
}