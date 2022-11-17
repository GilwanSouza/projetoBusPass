package com.br.buspass.cadastros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

import com.br.buspass.MenuFuncionario;
import com.br.buspass.classes.Horario;
import com.br.buspass.conexao.ConexaoBD;

public class CadastroHorarios {

    public static void main(String[] args) throws Exception {

        Horario Viagem = new Horario();
        Viagem.getNumero();
        System.out.println(Viagem);

        try (Scanner input = new Scanner(System.in)) {
            Random random = new Random();

            System.out.println("\nQual o horário de IDA que deseja disponibilizar? \n");
            String hrIda = input.nextLine();

            System.out.println("\nQual o horário de VOLTA que deseja disponibilizar? \n");
            String hrVolta = input.nextLine();

            System.out.println("\nQual a data do horário disponibilizado? \n");
            String dtViagem = input.nextLine();

            int numero = random.nextInt(10000);
            
            Horario horario = new Horario(hrIda, hrVolta,
                LocalDate.parse(dtViagem, DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                numero);
 
            if (ConexaoBD.cadastroHorario(horario)) {
                System.out.println("\nHorário cadastrado com sucesso! \n");
            } else {
                System.err.println("\nO horário não foi cadasdrados! \n");
            }

            MenuFuncionario.main(args);

            input.close();
        }
    }
}