package com.br.buspass.testes;

/*
[RF 003] O sistema deve possibilitar o cadastro de um usuário funcionário através do preenchimento dos seguintes dados: 
nome, foto, CPF, senha e informações do veículo.
*/

import java.util.Scanner;

import com.br.buspass.classes.Funcionario;
import com.br.buspass.conexao.ConexaoBD;

public class TestaFuncionario {
    public static void main(String[] args) throws Exception {
        try (Scanner entrada = new Scanner(System.in)) {
            String Nome;
            String CPF;
            String Senha;
            int id_veiculo;

            System.out.println("\nInforme seu nome completo: \n");
            Nome = entrada.nextLine();

            System.out.println("\nInforme seu CPF: \n");
            CPF = entrada.nextLine();

            System.out.print("\nInforme sua senha: \n");
            Senha = entrada.nextLine();

            System.out.println("\nInforme o ID do veiculo que dirige: \n");
            id_veiculo = entrada.nextInt();

            Funcionario funcionario = new Funcionario();
            funcionario.setNome(Nome);
            funcionario.setCPF(CPF);
            funcionario.setSenha(Senha);
            funcionario.setId_veiculo(id_veiculo);

            
            ConexaoBD.cadastroFuncionario(funcionario);
        }

        System.out.println("\nFuncuonario cadastrado com sucesso!!!\n");
    }
}