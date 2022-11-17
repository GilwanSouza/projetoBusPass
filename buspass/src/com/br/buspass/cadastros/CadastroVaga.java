package com.br.buspass.cadastros;

/* 
[RF 007] O sistema deve possibilitar o cadastro ao motorista ou empresa de quantas vagas o veículo tem. 
*/

import java.util.Scanner;

import com.br.buspass.MenuFuncionario;
import com.br.buspass.classes.VagaVeiculo;
import com.br.buspass.conexao.ConexaoBD;

public class CadastroVaga {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        try {

            System.out.println("\nInforme a quantidade de vagas disponíveis no veículo: \n");
            int quantidade = entrada.nextInt();

            System.out.println("\nInforme qual o ID do seu veículo: \n");
            int id_Search = entrada.nextInt();

            VagaVeiculo vagas = new VagaVeiculo(quantidade, id_Search);

            if (ConexaoBD.cadastroVaga(vagas)) {
                System.out.println("\nVagas cadastradas com sucesso! \n");
            } else {
                System.err.println("\nAs Vagas não foram cadasdradas! \n");
            }

            MenuFuncionario.main(args);

        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
        entrada.close();
    }
}