package com.br.buspass;

import java.util.Scanner;

import com.br.buspass.cadastros.CadastroComprovante;
import com.br.buspass.cadastros.CadastroVaga;
import com.br.buspass.cadastros.CadastroVeiculo;
import com.br.buspass.funcionalidades.AtualizaFuncio;
import com.br.buspass.funcionalidades.ExcluirDadosVel;
import com.br.buspass.funcionalidades.VisuDadosAluno;

public class MenuFuncionario {
    
    public static void main(String[] args) throws Exception {
        Scanner inputFuncio = new Scanner(System.in);
        
        int entrada = 0;

        System.out.println("\n Olá, bem vindo(a), o que deseja fazer? \n");
        System.out.println("Para cadastro de vagas digite 1");
        System.out.println("Para cadastro de veículo digite 2");
        System.out.println("Para excluir dados de um veículo digite 3");
        System.out.println("Visualizar dados de um passageiro digite 4");
        System.out.println("Atualizar dados própios digite 5");
        System.out.println("Cadastrar se o aluno pagou o mês digite 6");
        
        entrada = inputFuncio.nextInt();

        switch (entrada) {
            case 1:
                CadastroVaga.main(args);                
                break;
        
            case 2:
                CadastroVeiculo.main(args);
                break;
            
            case 3:
                ExcluirDadosVel.main(args);
                break;

            case 4:
                VisuDadosAluno.main(args);
                break;
            
            case 5:
                AtualizaFuncio.main(args);
                break;

            case 6:
                CadastroComprovante.main(args);
                break;
        }
        inputFuncio.close();

    }
}
