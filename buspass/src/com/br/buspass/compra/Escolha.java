package com.br.buspass.compra;

public class Escolha {

    private int num_horario;
    private int matricula;

    public Escolha() {

    }

    public Escolha(int matricula, int num_horario) {
        this.matricula = matricula;
        this.num_horario = num_horario;  
    }

    public int getNum_horario() {
        return num_horario;
    }

    public void setNum_horario(int num_horario) {
        this.num_horario = num_horario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int mat) {
        this.matricula = mat;
    }

}
