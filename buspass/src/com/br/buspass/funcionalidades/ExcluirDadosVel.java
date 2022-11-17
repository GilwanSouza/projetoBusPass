package com.br.buspass.funcionalidades;

import java.util.Scanner;

import com.br.buspass.classes.Veiculo;
import com.br.buspass.conexao.ConexaoBD;

public class ExcluirDadosVel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n Digite o ID do veiculo: \n");
        int entrada = input.nextInt();

        Veiculo excluir = new Veiculo();

        excluir.setId_vel(entrada);

        if (ConexaoBD.ExcluirVeiculo(excluir)) {
            System.out.println("\n Dados do veiculo excluido com sucesso! \n");
        } else {
            System.err.println("\n O veículo não foi excluido do sistema! \n");
        }

        input.close();
    }

}
