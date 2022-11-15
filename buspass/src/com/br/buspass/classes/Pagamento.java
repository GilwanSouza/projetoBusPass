package com.br.buspass.classes;

public class Pagamento {

    private String mes;
    private int mat_pagador;
    private String dt_pago;

    public Pagamento() {

    }

    public Pagamento(String mes, int mat_pagador, String dt_pago) {
        this.mes = mes;
        this.mat_pagador = mat_pagador;
        this.dt_pago = dt_pago;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getMat_pagador() {
        return mat_pagador;
    }

    public void setMat_pagador(int mat_pagador) {
        this.mat_pagador = mat_pagador;
    }

    public String getDt_pago() {
        return dt_pago;
    }

    public void setDt_pago(String dt_pago) {
        this.dt_pago = dt_pago;
    }

}
