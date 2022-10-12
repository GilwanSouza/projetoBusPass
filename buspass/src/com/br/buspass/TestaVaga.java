package com.br.buspass;

/* 
[RF 007] O sistema deve possibilitar o cadastro ao motorista ou empresa de quantas vagas o veículo tem. 
*/

import java.util.Scanner;

import com.br.buspass.conexao.ConexaoBD;

public class TestaVaga {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println(" Informe a quantidade de vagas desponiveis no veículo: ");
        int quantidade = entrada.nextInt();

        System.out.println("\n Informe qual o ID do seu veiculo: ");
        int id_Search = entrada.nextInt();
        
        entrada.close();

        VagaVeiculo vagas = new VagaVeiculo(); 
        vagas.setVaga(quantidade);
        vagas.setId_Search(id_Search);
    
        ConexaoBD.cadastroVaga(vagas);

        System.out.println("Vagas do veiculo cadastradas com sucesso!!!");
    }
}