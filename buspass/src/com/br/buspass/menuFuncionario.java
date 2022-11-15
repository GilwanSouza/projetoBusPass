package com.br.buspass;

import java.util.Scanner;

import com.br.buspass.testes.TestaComprovante;
import com.br.buspass.testes.TestaVaga;
import com.br.buspass.testes.TestaVeiculo;

public class menuFuncionario {
    
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n Olá, bem vindo(a), o que deseja fazer? \n");
        System.out.println("Para cadastro de vagas digite 1");
        System.out.println("Para cadastro de veículo digite 2");
        System.out.println("Para excluir dados de um veículo digite 3");
        System.out.println("Visualizar dados de um passageiro digite 4");
        System.out.println("Atualizar dados própios digite 5");
        System.out.println("Cadastrar se o aluno pagou o mês digite 6");
        int entrada = input.nextInt();

        switch (entrada) {
            case 1:
                TestaVaga.main(args);                
                break;
        
            case 2:
                TestaVeiculo.main(args);
                break;
            
            case 3:
                ExcluirDadosVel.main(args);
                break;

            case 4:
                VisuDadosAluno.main(args);
                break;
            
            case 5:
                atualizafuncio.main(args);
                break;

            case 6:
                TestaComprovante.main(args);
                break;
        }

    }
}
