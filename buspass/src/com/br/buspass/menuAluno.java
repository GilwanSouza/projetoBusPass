package com.br.buspass;

import java.util.Scanner;

import com.br.buspass.cadastros.CadastroEscolha;
import com.br.buspass.funcionalidades.AtualizaAluno;

public class MenuAluno {
    
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("\n Olá, seja bem vindo(a) o que deseja fazer? \n");
        System.out.println("\n Digite 1 para cadastra-se em algum horario e 2 pra atualizar seus dados \n");
        int entrada = input.nextInt();

        switch (entrada) {
            case 1:
                CadastroEscolha.main(args);
                
                break;
        
            case 2:
                AtualizaAluno.main(args);

                break;
        }
        input.close();

    }

}
