package com.br.buspass.compra;

public class Pix implements FormaDePagamento {
    
    private double valor = 0.0;
    private String chave = null;
    private String senha = null;
    private boolean statusPix = false;

    public Pix(double valor, String chave, String senha) {
        this.valor = valor;
        this.chave = chave;
        this.senha = senha;
    }

    public void isPix(String chave, String senha) {
        if(this.chave != null && this.senha != null){
            if (this.chave.equals(chave) && this.senha.equals(senha)) {
                this.statusPix = true;
            }
        }
    }

    @Override
    public boolean realizarPagamento(double valorPagamento) {
        if (this.statusPix && this.valor >= valorPagamento) {
            this.statusPix = false;
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

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isStatusPix() {
        return statusPix;
    }

    public void setStatusPix(boolean statusPix) {
        this.statusPix = statusPix;
    }
}