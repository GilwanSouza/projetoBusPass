package com.br.buspass.testes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

import com.br.buspass.classes.Horario;
import com.br.buspass.conexao.ConexaoBD;

public class TestaHorarios {

    public static void main(String[] args) {

        Horario Viagem = new Horario();
        Viagem.getNumero();
        System.out.println(Viagem);

        try (Scanner input = new Scanner(System.in)) {
            Random random = new Random();

            System.out.println("\n Qual o horário de IDA que deseja disponibilizar? \n");
            String hrIda = input.nextLine();

            System.out.println("\n Qual o horário de VOLTA que deseja disponibilizar? \n");
            String hrVolta = input.nextLine();

            System.out.println("\n Qual data do horario disponibilizado? \n");
            String dtViagem = input.nextLine();

            int numero = random.nextInt(10000, 99999);

            
            
            Horario horario = new Horario();
            horario.setDataViagem(LocalDate.parse(dtViagem, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            horario.setHrIda(hrIda);
            horario.setHrVolta(hrVolta);
            horario.setNumero(numero);

            
            ConexaoBD.cadastroHorario(horario);
 
        }

        System.out.println("\nViagem cadastrada com sucesso!\n");
    }

}