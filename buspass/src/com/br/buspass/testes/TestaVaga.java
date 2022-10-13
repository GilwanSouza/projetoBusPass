package com.br.buspass.testes;

/* 
[RF 007] O sistema deve possibilitar o cadastro ao motorista ou empresa de quantas vagas o veículo tem. 
*/

import java.util.Scanner;

import com.br.buspass.classes.VagaVeiculo;
import com.br.buspass.conexao.ConexaoBD;

public class TestaVaga {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nInforme a quantidade de vagas desponiveis no veículo: \n");
        int quantidade = entrada.nextInt();

        System.out.println("\n Informe qual o ID do seu veiculo: \n");
        int id_Search = entrada.nextInt();
        
        entrada.close();

        VagaVeiculo vagas = new VagaVeiculo(); 
        vagas.setVaga(quantidade);
        vagas.setId_Search(id_Search);
    
        ConexaoBD.cadastroVaga(vagas);

        System.out.println("\nVagas do veiculo cadastradas com sucesso!!!\n");
    }
}