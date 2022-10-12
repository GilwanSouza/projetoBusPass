package br.com.jeilsonbarbalho.ap3.aula5.questoes.projetosupermercado;

public class Dinheiro implements FormaDePagamento {
    
    private double valor = 0.0;

    public Dinheiro(double valor) {
        this.valor = valor;
    }

    @Override
    public boolean realizarPagamento(double valorPagamento) {
        if(this.valor >= valorPagamento){
            this.valor = this.valor - valorPagamento;
            return true;
        } else {
            return false;
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}