package com.example.demo;

import java.sql.Date;

public class Vendas {
    private Long vendaID;
    private Date dataVenda;
    private String valor;
    private Long vendedorID;
    private String vendedorNome;

    public void gravarNovaVenda(String newValor, Long newVendedorID, String newVendedorNome) {
        this.valor = newValor;
        this.vendedorID = newVendedorID;
        this.vendedorNome = newVendedorNome;
    }

    public String getVendas(Date dataInicial, Date dataFinal) {

        return "asdsd";
    }
}