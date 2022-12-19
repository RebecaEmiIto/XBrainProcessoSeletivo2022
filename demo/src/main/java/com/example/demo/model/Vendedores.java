package com.example.demo.model;

import java.sql.Date;

public class Vendedores {
    private Long vendedorID;
    private String vendedorNome;
    private Date dataInsercao;

    public String getVendedor() {
        return vendedorNome;
    }
}