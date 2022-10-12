package br.com.jeilsonbarbalho.ap3.aula5.questoes.projetosupermercado;

public class Item {
    
    private Produto produto;
    private int quantidade;

    public Item(Produto produto, int quantidade){
        this.produto = produto;
        setQuantidade(quantidade);
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        if(produto.getQuantidade() >= quantidade)
            this.quantidade = quantidade;
        else 
            System.out.println("O estoque é inferior a quantidade desejada!");
    }

    @Override
    public String toString() {
        return this.produto + "Quantidade = " + this.quantidade;
    }
}