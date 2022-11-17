package com.br.buspass.funcionalidades;

import java.util.Scanner;

import com.br.buspass.classes.Veiculo;
import com.br.buspass.conexao.ConexaoBD;

public class ExcluirDadosVel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nDigite o ID do veículo: \n");
        int entrada = input.nextInt();

        Veiculo excluir = new Veiculo();

        excluir.setId_vel(entrada);

        if (ConexaoBD.ExcluirVeiculo(excluir)) {
            System.out.println("\nDados do veículo excluidos com sucesso! \n");
        } else {
            System.err.println("\nO veículo não foi excluido do sistema! \n");
        }

        input.close();
    }

}
