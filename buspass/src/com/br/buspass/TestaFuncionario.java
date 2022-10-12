package com.br.buspass;

/*
[RF 003] O sistema deve possibilitar o cadastro de um usuário funcionário através do preenchimento dos seguintes dados: 
nome, foto, CPF, senha e informações do veículo.
*/

import java.util.Scanner;

import com.br.buspass.conexao.ConexaoBD;

public class TestaFuncionario {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        String Nome;
        String CPF;
        String Senha;
        int id_veiculo;

        System.out.println("Informe seu nome completo: ");
        Nome = entrada.nextLine();

        System.out.println("Informe seu CPF: ");
        CPF = entrada.nextLine();

        System.out.print("Informe sua senha: ");
        Senha = entrada.nextLine();

        System.out.println("Informe o ID do veiculo que dirige: ");
        id_veiculo = entrada.nextInt();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome(Nome);
        funcionario.setCPF(CPF);
        funcionario.setSenha(Senha);
        funcionario.setId_veiculo(id_veiculo);

        
        ConexaoBD.cadastroFuncionario(funcionario);

        System.out.println("Funcuonario cadastrado com sucesso!!!");
    }
}