package com.br.buspass;

import java.util.Scanner;

import com.br.buspass.testes.TestaVeiculo;

public class trocarveiculo {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
            
        System.out.println("Informe (1) para escolher um veículo já cadastrado ou (2) para cadastrar um novo veículo:");
        int carro = entrada.nextInt();

        switch (carro) {
            case 1:
                SlctVeiculo.main(args);
                break;
            
            case 2:
                TestaVeiculo.main(args);
        }  
    }
}