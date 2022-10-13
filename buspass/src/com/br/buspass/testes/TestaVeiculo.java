package com.br.buspass.testes;

import java.util.Random;
import java.util.Scanner;

import com.br.buspass.classes.Veiculo;
import com.br.buspass.conexao.ConexaoBD;

public class TestaVeiculo {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("\n Qual a placa do veículo? \n");
            String placa = input.nextLine();

            System.out.println("\n Qual a numeração de chassi do veículo? \n");
            String chassi = input.nextLine();

            System.out.println("\n Qual o modelo e a cor do veículo? \n");
            String modelo = input.nextLine();

            System.out.println("\n Qual o ano do veículo? \n");
            int ano = input.nextInt();

            Random random = new Random();
            int numero = random.nextInt(10000);

            Veiculo veiculo = new Veiculo(); 
            veiculo.setAno(ano);
            veiculo.setModelo(modelo);
            veiculo.setChassi(chassi);
            veiculo.setPlaca(placa);
            veiculo.setId_vel(numero);
   
            ConexaoBD.cadastroVeiculo(veiculo);
        }

        System.out.println("\nVeiculo cadastrado com sucesso!!!\n");
    }

}