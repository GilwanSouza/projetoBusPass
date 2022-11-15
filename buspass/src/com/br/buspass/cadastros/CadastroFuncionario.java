package com.br.buspass.cadastros;

import java.util.Random;

/*
[RF 003] O sistema deve possibilitar o cadastro de um usuário funcionário através do preenchimento dos seguintes dados: 
nome, foto, CPF, senha e informações do veículo.
*/

import java.util.Scanner;

import com.br.buspass.classes.Funcionario;
import com.br.buspass.conexao.ConexaoBD;

public class CadastroFuncionario {
    public static void main(String[] args) throws Exception {
        try (Scanner entrada = new Scanner(System.in)) {
            Random random = new Random();

            System.out.println("\nInforme seu nome completo: \n");
            String Nome = entrada.nextLine();

            System.out.println("\nInforme seu CPF: \n");
            String CPF = entrada.nextLine();

            System.out.print("\nInforme sua senha: \n");
            String Senha = entrada.nextLine();

            System.out.println("\nInforme o ID do veiculo que dirige: \n");
            int id_veiculo = entrada.nextInt();

            int id_funcio = random.nextInt(10000);

            Funcionario funcionario = new Funcionario();
            funcionario.setNome(Nome);
            funcionario.setCPF(CPF);
            funcionario.setSenha(Senha);
            funcionario.setId_funcio(id_funcio);
            funcionario.setId_veiculo(id_veiculo);

            if (ConexaoBD.cadastroFuncionario(funcionario)) {
                System.out.println("\n Funcionario cadastrado com sucesso! \n");
            } else {
                System.out.println("\n O funcionario não foi cadasdrado! \n");
            }
        }
    }
}