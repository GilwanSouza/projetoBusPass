package com.br.buspass.classes;

public class VagaVeiculo {

    private int vaga;
    private int id_Search;

    public VagaVeiculo() {

    }

    public VagaVeiculo(int vaga, int id_Search) {
        this.vaga = vaga;
        this.id_Search = id_Search;
    }

    public int getId_Search() {
        return id_Search;
    }

    public void setId_Search(int id_Search) {
        this.id_Search = id_Search;
    }

    public int getVaga() {
        return vaga;
    }

    public void setVaga(int vaga) {
        this.vaga = vaga;
    }

    public void setVaga(VagaVeiculo vaga2) {
    }

}