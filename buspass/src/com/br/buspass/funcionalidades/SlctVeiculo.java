package com.br.buspass.funcionalidades;

import java.util.Scanner;

import com.br.buspass.MenuFuncionario;
import com.br.buspass.classes.Veiculo;
import com.br.buspass.conexao.ConexaoBD;

public class SlctVeiculo {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("\nInforme o motivo da troca do veículo:");
        String troca = input.nextLine();

        System.out.println("\nInforme o ID do veículo que deseja escolher:\n");
        int vel_antigo = input.nextInt();

        System.out.println("\nInforme o veículo que estava sendo usado:\n");
        int vel_novo = input.nextInt();

        Veiculo ver_vel = new Veiculo();
        ver_vel.setMotivo(troca);
        ver_vel.setId_vel_antigo(vel_antigo);
        ver_vel.setId_vel_novo(vel_novo);

        ConexaoBD.VerVeiculo(ver_vel);

        MenuFuncionario.main(args);

        input.close();
    }
}