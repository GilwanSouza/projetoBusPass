package com.br.buspass.cadastros;

import java.util.Random;
import java.util.Scanner;

import com.br.buspass.MenuFuncionario;
import com.br.buspass.classes.Veiculo;
import com.br.buspass.conexao.ConexaoBD;

public class CadastroVeiculo {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in);
                Scanner inputTXT = new Scanner(System.in);) {

            System.out.println("\nQual a placa do veículo? \n");
            String placa = inputTXT.nextLine();

            System.out.println("\nQual a numeração do chassi do veículo? \n");
            String chassi = inputTXT.nextLine();

            System.out.println("\nQual o modelo e a cor do veículo? \n");
            String modelo = inputTXT.nextLine();

            System.out.println("\nQual o ano do veículo? \n");
            int ano = input.nextInt();

            Random random = new Random();
            int numero = random.nextInt(10000);

            Veiculo veiculo = new Veiculo(placa, chassi, modelo, ano, numero);

            if (ConexaoBD.cadastroVeiculo(veiculo)) {
                System.out.println("\nVeículo cadastrado com sucesso! \n");
            } else {
                System.err.println("\nO veículo não foi cadasdrado! \n");
            }

            MenuFuncionario.main(args);

            input.close();
            inputTXT.close();
        }
    }

}