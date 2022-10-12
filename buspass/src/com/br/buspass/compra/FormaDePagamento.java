package com.br.buspass.compra;

public interface FormaDePagamento {
    
    public abstract boolean realizarPagamento(double valorPagamento);
}