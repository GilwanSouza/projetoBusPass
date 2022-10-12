package com.br.buspass;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

import com.br.buspass.conexao.ConexaoBD;

public class TestaVeiculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Veiculo vel = new Veiculo();

        System.out.println("\n Qual a placa do veículo? \n");
        String placa = input.nextLine();

        System.out.println("\n Qual a numeração de chassi do veículo? \n");
        String chassi = input.nextLine();

        System.out.println("\n Qual o modelo e cor do veículo? \n");
        String modelo = input.nextLine();

        System.out.println("\n Qual o ano do veículo? \n");
        int ano = input.nextInt();

        Random random = new Random();
        int numero = random.nextInt(10000, 99999);

        Veiculo veiculo = new Veiculo(); 
        veiculo.setAno(ano);
        veiculo.setModelo(modelo);
        veiculo.setChassi(chassi);
        veiculo.setString(placa);
        veiculo.setId_vel(numero);
    
        ConexaoBD.cadastroVeiculo(veiculo);

        System.out.println("Veiculo cadastrado com sucesso!!!");
    }

}