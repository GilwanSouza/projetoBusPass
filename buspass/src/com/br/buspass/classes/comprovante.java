package com.br.buspass.classes;

public class comprovante {
    
    private String Comprovante;

    public String getComprovante() {
        return Comprovante;
    }

    public void setComprovante(String comprovante) {
        Comprovante = comprovante;
    }

    @Override
    public String toString() {
        return "Comprovante" +
        "\nComprovante = " + Comprovante + "\n";
    } 
}