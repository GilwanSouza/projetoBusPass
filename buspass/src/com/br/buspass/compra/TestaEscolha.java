package com.br.buspass.compra;

import java.util.Scanner;

import com.br.buspass.Aluno;
import com.br.buspass.Horario;
import com.br.buspass.conexao.ConexaoBD;


public class TestaEscolha {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("\nHorarios Disponiveis\n");
        
        System.out.println("\nDigite sua matricula: \n");
        int mat = input.nextInt();

        Aluno aluno_passagem = new Aluno();
        aluno_passagem.setMatricula(mat);

    }
}