package com.br.buspass.funcionalidades;

import java.util.Scanner;

import com.br.buspass.MenuFuncionario;
import com.br.buspass.classes.Aluno;
import com.br.buspass.conexao.ConexaoBD;

public class VisuDadosAluno {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("\nDigite a matrícula do aluno: \n");
        int entrada = input.nextInt();

        Aluno visualisar = new Aluno();

        visualisar.setMatricula(entrada);

        ConexaoBD.VisualizarDados(visualisar);

        MenuFuncionario.main(args);

        input.close();
    }
    

}