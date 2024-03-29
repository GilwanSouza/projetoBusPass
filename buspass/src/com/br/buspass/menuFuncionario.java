package com.br.buspass;

import java.util.Scanner;

import com.br.buspass.cadastros.CadastroComprovante;
import com.br.buspass.cadastros.CadastroHorarios;
import com.br.buspass.cadastros.CadastroVaga;
import com.br.buspass.cadastros.CadastroVeiculo;
import com.br.buspass.funcionalidades.ExcluirDadosVel;
import com.br.buspass.funcionalidades.TrocarVeiculo;
import com.br.buspass.funcionalidades.VerDadosVel;
import com.br.buspass.funcionalidades.VisuDadosAluno;

public class MenuFuncionario {

    public static void main(String[] args) throws Exception {
        Scanner inputFuncio = new Scanner(System.in);

        int entrada = 0;

        do {

            System.out.println("\n-----Olá, bem vindo(a), o que deseja fazer?----- \n");
            System.out.println("(1) Para cadastro de vagas:");
            System.out.println("(2) Para cadastro de veículo:");
            System.out.println("(3) Para excluir dados de um veículo:");
            System.out.println("(4) Visualizar dados de um passageiro:");
            System.out.println("(5) Para confirmar o pagamento do aluno:");
            System.out.println("(6) Para visualizar os veiculos cadasdrados:");
            System.out.println("(7) Para cadastrar horarios:");
            System.out.println("(8) Para trocar de veiculo:");
            System.out.println("\n(0) Caso deseje cancelar a operação: \n");

            entrada = inputFuncio.nextInt();

            switch (entrada) {
                case 1:
                    CadastroVaga.main(args);
                    break;

                case 2:
                    CadastroVeiculo.main(args);
                    break;

                case 3:
                    ExcluirDadosVel.main(args);
                    break;

                case 4:
                    VisuDadosAluno.main(args);
                    break;

                case 5:
                    CadastroComprovante.main(args);
                    break;

                case 6:
                    VerDadosVel.main(args);
                    break;

                case 7:
                    CadastroHorarios.main(args);
                    break;

                case 8:
                    TrocarVeiculo.main(args);

            }

            inputFuncio.close();

        } while (entrada != 0);
        MenuPrincipal.main(args);
        inputFuncio.close();
    }
}