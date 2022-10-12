package com.br.buspass;

import java.sql.Date;
import java.time.LocalDate;

//[RF 011] O sistema deve possibilitar o motorista ou empresa definir seus horários de ida e volta.

public class Horario {

    private String hrIda;
    private String hrVolta;
    private LocalDate dataViagem;
    private int idViagem;

    public String getHrIda() {
        return hrIda;
    }

    public void setHrIda(String hrIda) {
        this.hrIda = hrIda;
    }

    public String getHrVolta() {
        return hrVolta;
    }

    public void setHrVolta(String hrVolta) {
        this.hrVolta = hrVolta;
    }

    public LocalDate getDataViagem() {
        return dataViagem;
    }

    public void setDataViagem(LocalDate dataViagem) {
        this.dataViagem = dataViagem;
    }

    public int getNumero() {
        return idViagem;
    }

    public void setNumero(int idViagem) {
        this.idViagem = idViagem;
    }

    public Horario(String hrIda2, String hrVolta2, LocalDate dataViagem2, int idViagem2, String viagem) {
    }

    public Horario() {
    }

    @Override
    public String toString() {
        return 
        "Horarios de viagens cadastrados com sucesso!!!";
    }

}