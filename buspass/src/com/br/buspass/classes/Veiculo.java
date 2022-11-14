package com.br.buspass.classes;

/*
[RF 021] O sistema deve possibilitar o cadastro de veículo, com informações como placa, chassi, 
modelo, ano, quantidade de vagas disponíveis.
*/

public class Veiculo {

    private String placa;
    private String chassi;
    private String modelo;
    private int ano;
    private int id_vel;

    public int getId_vel() {
        return id_vel;
    }

    public void setId_vel(int id_vel) {
        this.id_vel = id_vel;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return 
        "Veiculo [placa = "    + placa    +
        ", chassi = "          + chassi   +
        ", modelo = "          + modelo   +
        ", ano = "             + ano      +
        ", id_vel = "          + id_vel   +
        "]";
    }

    public void setAno(String ano) {
    }

    public void setString(String placa) {
    }

    public boolean next() {
        return false;
    }

}
