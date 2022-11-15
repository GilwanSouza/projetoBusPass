package com.br.buspass.funcionalidades;

import java.util.Scanner;

import com.br.buspass.classes.Aluno;
import com.br.buspass.conexao.ConexaoBD;

public class VisuDadosAluno {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n Digite a matricula do aluno: \n");
        int entrada = input.nextInt();

        Aluno visualisar = new Aluno();

        visualisar.setMatricula(entrada);

        ConexaoBD.VisualizarDados(visualisar);

        input.close();
    }
       
}