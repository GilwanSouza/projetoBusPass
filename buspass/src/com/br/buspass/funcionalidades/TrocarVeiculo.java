package com.br.buspass.funcionalidades;

import java.util.Scanner;

import com.br.buspass.cadastros.CadastroVeiculo;

public class TrocarVeiculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe (1) para escolher um veículo já cadastrado ou (2) para cadastrar um novo veículo:");
        int carro = entrada.nextInt();

        switch (carro) {
            case 1:
                SlctVeiculo.main(args);
                break;

            case 2:
                CadastroVeiculo.main(args);
        }
        entrada.close();
    }
}