package com.br.buspass;

import java.util.Scanner;

import com.br.buspass.classes.Aluno;
import com.br.buspass.classes.Funcionario;
import com.br.buspass.conexao.ConexaoBD;
import com.br.buspass.logins.LoginAluno;

public class menuprincipal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int usuario = 0;
    
        System.out.println("\n Deseja fazer o login como aluno ou funcionário? \n Digite 01 para aluno e 02 para funcionario \n");
        usuario = input.nextInt();

        if (usuario == 01) {

            ConexaoBD.LogarAluno(null);

        } else if (usuario == 02){

            ConexaoBD.LoginFunc(null); 
        
        }

    }

}