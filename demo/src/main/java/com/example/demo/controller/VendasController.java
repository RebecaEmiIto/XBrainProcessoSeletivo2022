package com.example.demo.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.VendasRepo;
import com.example.demo.model.Vendas;

import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class VendasController {

    @Autowired
    private VendasRepo vendasRepo;

    @RequestMapping("/teste")
    public String teste() {
        return "Hello World!";
    }

    // @RequestMapping(value = "/PostNovaVenda", method = RequestMethod.POST)
    // public List<String> PostNovaVenda() {
    /* Date dateVenda, int valor, int vendedorID, String vendedorNome */
    // return List.of("Hello", "World!");
    // }

    //
    @PostMapping("/PostNovaVenda")
    public Vendas PostNovaVenda(@RequestBody Vendas vendas) {
        /* Date dateVenda, int valor, int vendedorID, String vendedorNome */
        return vendasRepo.save(vendas);
    }

    // Busca Quantidade de vendas por vendedor dentro de um período de tempo;
    // Ex: ID 1 | nome Ana | venda total 20 | vendas/dias 4
    @RequestMapping(value = "/GetVendasPorVendedores", method = RequestMethod.GET)
    // @GetMapping("/GetVendasPorVendedores")
    public List<Vendas> GetVendedoers(Date dataInicial, Date dataFinal, int vendedorID) {
        return vendasRepo.findAll();
    }
}