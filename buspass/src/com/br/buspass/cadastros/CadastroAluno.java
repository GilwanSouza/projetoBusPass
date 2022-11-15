package com.br.buspass.cadastros;

/* 
[RF 002] O sistema deve possibilitar que todos os tipos de usuários tenham no seu cadastro informações como: 
Nome, número de telefone, CPF, senha e foto. Caso seja um tipo usuário Aluno, deve-se guardar o número da matrícula. 
*/

import java.util.Scanner;

import com.br.buspass.classes.Aluno;
import com.br.buspass.conexao.ConexaoBD;

public class CadastroAluno {
    public static void main(String[] args) throws Exception {
        try (Scanner entrada = new Scanner(System.in)) {
            String Nome;
            String Numero;
            String Cpf;
            String Senha;
            int Matricula;

            System.out.println("\nInforme seu nome completo: \n");
            Nome = entrada.nextLine();
   
            System.out.println("\nInforme seu número de celular: \n");
            Numero = entrada.nextLine();
   
            System.out.println("\nInforme seu CPF: (Com pontos e digito)) \n");
            Cpf = entrada.nextLine();
   
            System.out.println("\nInforme sua senha: \n");
            Senha = entrada.nextLine();     

            System.out.println("\nInforme o número de sua matrícula: \n");
            Matricula = entrada.nextInt();

            Aluno aluno = new Aluno();
            aluno.setNome(Nome);
            aluno.setNumero(Numero);
            aluno.setCpf(Cpf);
            aluno.setSenha(Senha);
            aluno.setMatricula(Matricula);
   
            if (ConexaoBD.cadastroAluno(aluno)) {
                System.out.println("\n Aluno cadastrado com sucesso! \n");
            } else {
                System.err.println("\n O aluno não foi cadasdrado! \n");
            }
        }
    }

}