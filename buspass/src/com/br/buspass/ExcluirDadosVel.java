package com.br.buspass;

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

        ConexaoBD.ExcluirVeiculo(excluir);

    }

}
