package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Vendas")
public class Vendas {
    @Id
    @GeneratedValue
    private Long vendaID;
    private Date dataVenda;
    private String valor;
    private Long vendedorID;
    private String vendedorNome;

    public Vendas() {

    }

    public Vendas(String valor, Long vendedorID, String vendedorNome) {
        super();
        this.valor = valor;
        this.vendedorID = vendedorID;
        this.vendedorNome = vendedorNome;
    }

    public void gravarNovaVenda(String newValor, Long vendedorID2, String newVendedorNome) {
        this.valor = newValor;
        this.vendedorID = vendedorID2;
        this.vendedorNome = newVendedorNome;
    }

    public String getVendedorDaVenda() {
        return vendedorNome;
    }

    public Long getVendas() {
        return vendaID;
    }

    public Date getDataVenda() {
        return dataVenda;
    }
}