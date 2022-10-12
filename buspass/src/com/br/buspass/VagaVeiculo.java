package com.br.buspass;

/* 
[RF 007] O sistema deve possibilitar o cadastro ao motorista ou empresa de quantas vagas o veículo tem. 
*/

public class VagaVeiculo {
    
    private int vaga;
    private int id_Search;

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

    @Override
    public String toString() {
        return 
        "VagaVeiculo [vaga="      + vaga       +
        ", id_Search="            + id_Search  +
        "]";
    }
}