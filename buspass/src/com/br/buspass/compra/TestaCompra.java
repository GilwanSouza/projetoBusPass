package com.br.buspass.compra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaCompra {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Scanner inputText = new Scanner(System.in);

        Cliente cliente = new Cliente();
        cliente.setDinheiro(new Dinheiro(1000.0));
        cliente.setPix(new Pix(1000.0, "jeilson@gmail.com", "incorreto"));
        cliente.setCartao(new Cartao(1000.0, "135-00", "incorreto"));

        boolean resultado = false;

        String opcao = "sim";

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto(20.0, 10));
        produtos.add(new Produto(18.0, 15));
        produtos.add(new Produto(10.0, 20));
        produtos.add(new Produto(25.0, 10));
        produtos.add(new Produto(30.0, 13));

        while (opcao.equals("sim")) {
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println(i + " - " + produtos.get(i));
            }

            System.out.println("Imforme o código produto: ");
            int codProduto = input.nextInt();

            System.out.println("\nImforme a quantidade que deseja comprar: ");
            int quantidade = input.nextInt();

            cliente.getPedido().adicionarItem(produtos.get(codProduto), quantidade);

            System.out.println("\nDeseja adicionar outro item? Informe Sim ou Não: ");
            opcao = inputText.nextLine();
        }

        while (!resultado) {
            System.out.println(resultado);
            System.out.println("\nEscolha a forma de pagamento utilizando os códigos: [1] para Dinheiro, [2] para Pix, [3] para Cartão, "
            + "o valoro total do pedido é: " + cliente.getPedido().calcularValorPedido()  + "$");
            int formaPagamento = input.nextInt();

            switch (formaPagamento) {
                
                case 1:
                    resultado = cliente.getDinheiro().realizarPagamento(cliente.getPedido().calcularValorPedido());
                    break;
                
                case 2:
                    System.out.println("\nInforme a chave do pix: ");
                    String chave = inputText.nextLine();

                    System.out.println("\nInforme a sua senha: ");
                    String senhaPix = inputText.nextLine();

                    cliente.getPix().isPix(chave, senhaPix);
                    resultado = cliente.getPix().realizarPagamento(cliente.getPedido().calcularValorPedido());
                    break;
                
                case 3:
                    System.out.println("\nInforme o número do cartão: ");
                    String numero = inputText.nextLine();

                    System.out.println("\nInforme a senha do cartão: ");
                    String senhaCartao = inputText.nextLine();

                    cliente.getCartao().isCartao(numero, senhaCartao);
                    resultado = cliente.getCartao().realizarPagamento(cliente.getPedido().calcularValorPedido());
                    break;
                
                default:
                    System.out.println("\nOpção de pagamento inválida!");
            }

            System.out.println(resultado);
        }

        System.out.println("\nPagamento Realizado com sucesso!");
        cliente.getPedido().listarItens();
        System.out.println("Valor total Pago: " + cliente.getPedido().calcularValorPedido() + "$");

        input.close();
        inputText.close();
    }
}