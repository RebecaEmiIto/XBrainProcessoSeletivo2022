package com.example.demo;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.repositorio.VendasRepo;

public class Vendas {
    private Long vendaID;
    private Date dataVenda;
    private String valor;
    private Long vendedorID;
    private String vendedorNome;

    @Autowired
    private VendasRepo vendasRepo;

    public void gravarNovaVenda(String newValor, Long newVendedorID, String newVendedorNome) {
        this.valor = newValor;
        this.vendedorID = newVendedorID;
        this.vendedorNome = newVendedorNome;
    }

    public String getVendas(Date dataInicial, Date dataFinal) {

        return "asdsd";
    }
}