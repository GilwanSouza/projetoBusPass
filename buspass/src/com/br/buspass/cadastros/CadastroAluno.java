package com.br.buspass.cadastros;

import java.util.Scanner;

import com.br.buspass.classes.Aluno;
import com.br.buspass.conexao.ConexaoBD;

public class CadastroAluno {
    public static void main(String[] args) throws Exception {
        try (Scanner entrada = new Scanner(System.in)) {

            System.out.println("\nInforme seu nome completo: \n");
            String Nome = entrada.nextLine();
   
            System.out.println("\nInforme seu número de celular: \n");
            String Numero = entrada.nextLine();
   
            System.out.println("\nInforme seu CPF: (Com pontos e digito)) \n");
            String Cpf = entrada.nextLine();
   
            System.out.println("\nInforme sua senha: \n");
            String Senha = entrada.nextLine();     

            System.out.println("\nInforme o número de sua matrícula: \n");
            int Matricula = entrada.nextInt();

            Aluno aluno = new Aluno(Nome, Numero, Cpf, Senha, Matricula);
   
            if (ConexaoBD.cadastroAluno(aluno)) {
                System.out.println("\n Aluno cadastrado com sucesso! \n");
            } else {
                System.err.println("\n O aluno não foi cadasdrado! \n");
            }
        }
    }

}