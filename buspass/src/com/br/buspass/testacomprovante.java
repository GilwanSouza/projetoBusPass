package com.br.buspass;

import java.util.Scanner;

public class testacomprovante {
    
    int comprovante;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nO aluno pagou o carro? Digite (1) para SIM e (2) para NÃO");
        int imput = input.nextInt();

        if (imput == 1) {

            System.err.println("\nComprovante adicionado com sucesso!");

        } else {

            System.err.println("\nO aluno não terá acesso ao carro até que pague o servoço");

        }
    }
}