package com.br.buspass.funcionalidades;

import java.util.Scanner;

import com.br.buspass.MenuFuncionario;
import com.br.buspass.cadastros.CadastroVeiculo;

public class TrocarVeiculo {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n(1) Para escolher um veículo já cadastrado:\n(2) Para cadastrar um novo veículo:\n");
        int carro = entrada.nextInt();

        switch (carro) {
            case 1:
                SlctVeiculo.main(args);
                break;

            case 2:
                CadastroVeiculo.main(args);
        }

        entrada.close();
        MenuFuncionario.main(args);

        
    }
}