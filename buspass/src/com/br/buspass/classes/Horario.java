package com.br.buspass.classes;

import java.time.LocalDate;

//[RF 011] O sistema deve possibilitar o motorista ou empresa definir seus horários de ida e volta.

public class Horario {

    private String hrIda;
    private String hrVolta;
    private LocalDate dataViagem;
    private int idViagem;

    public Horario() {
    }

    public Horario(String hrIda, String hrVolta, LocalDate dataViagem, int idViagem) {
        this.hrIda = hrIda;
        this.hrVolta = hrVolta;
        this.dataViagem = dataViagem;
        this.idViagem = idViagem;
    }

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

}