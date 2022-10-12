package com.br.buspass.compra;

import java.util.Scanner;

import com.br.buspass.conexao.ConexaoBD;


public class TestaEscolha {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("\nHorarios Disponiveis\n");
        
        ConexaoBD.CompraPassagem();

        System.out.println("\nDigite sua matricula: \n");
        int mat = input.nextInt();

        System.out.println("\nDigite o ID do horario desejado: \n");
        int num_horario = input.nextInt();

        Escolha hr_viagem = new Escolha();
        hr_viagem.setMatricula(mat);
        hr_viagem.setNum_horario(num_horario);

        ConexaoBD.EscolhaHorario(hr_viagem);

    }
}