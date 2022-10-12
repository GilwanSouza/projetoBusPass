package br.com.jeilsonbarbalho.ap3.aula5.questoes.projetosupermercado;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    
    private List<Item> itens = new ArrayList<>();

    public List<Item> getItens() {
        return itens;
    }
    
    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public void adicionarItem(Produto produto, int quantidade){
        this.itens.add(new Item(produto, quantidade));
    }

    public void listarItens(){
        for(Item item : itens){
            System.out.println(item);
        }
    }

    public double calcularValorPedido(){
        double valorTotal = 0.0;
        for (Item item : itens) {
            valorTotal = valorTotal + item.getQuantidade() * item.getProduto().getPreco();
        }
        return valorTotal;
    }
}