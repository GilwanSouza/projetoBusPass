package com.br.buspass.funcionalidades;

import java.util.Scanner;

import com.br.buspass.MenuFuncionario;
import com.br.buspass.classes.Veiculo;
import com.br.buspass.conexao.ConexaoBD;

public class VerDadosVel {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        int entrada = 0;
        String placa = "";

        do {

            System.out.println("\n(1) Para visualizar os veículos cadastrados:\n(0) Para voltar ao menu: \n");
            entrada = input.nextInt();

            if (entrada == 1) {
                System.out.println("\nDigite a placa do veículo que deseja visualizar os dados: \n");
                placa = input2.nextLine();

                Veiculo vel = new Veiculo();
                vel.setPlaca(placa);

                ConexaoBD.VerVeiculo(vel);
            } else {
                MenuFuncionario.main(args);
            }

        } while (entrada != 0);
    }
}
