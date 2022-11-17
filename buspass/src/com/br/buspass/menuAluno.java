package com.br.buspass;

import java.util.Scanner;

import com.br.buspass.cadastros.CadastroEscolha;
import com.br.buspass.funcionalidades.AtualizaAluno;

public class MenuAluno {

    public static void main(String[] args) throws Exception {
        Scanner inputAluno = new Scanner(System.in);

        int entrada = 0;

        System.out.println("\n-----Olá, seja bem vindo(a) o que deseja fazer?----- \n");
        System.out.println("\n(1) Para cadastra-se em algum horário:\n(2) Para atualizar seus dados: \n");
        System.out.println("\n(0) Caso deseje cancelar a operação: \n");
        entrada = inputAluno.nextInt();

        do {
           
            switch (entrada) {
                case 1:
                    CadastroEscolha.main(args);
                    break;
            
                case 2:
                    AtualizaAluno.main(args);
                    break;
    
                case 0:
                    MenuPrincipal.main(args);
    
            }
            inputAluno.close();

        } while (entrada != 0);
    }
}