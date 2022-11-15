package com.br.buspass.compra;

public class Cartao implements FormaDePagamento {

    private double valor = 0.0;
    private String numero = null;
    private String senha = null;
    private boolean statusCartao = false;

    public Cartao(double valor, String numero, String senha) {
        this.valor = valor;
        this.numero = numero;
        this.senha = senha;
    }

    public void isCartao(String numero, String senha) {
        if (this.numero != null && this.senha != null) {
            if (this.numero.equals(numero) && this.senha.equals(senha)) {
                this.statusCartao = true;
            }
        }
    }

    @Override
    public boolean realizarPagamento(double valorPagamento) {
        if (this.statusCartao && this.valor >= valorPagamento) {
            this.statusCartao = false;
            this.valor = this.valor - valorPagamento;
            return true;
        }
        return false;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isStatusCartao() {
        return statusCartao;
    }

    public void setStatusCartao(boolean statusCartao) {
        this.statusCartao = statusCartao;
    }
}