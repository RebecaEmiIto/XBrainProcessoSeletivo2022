package com.example.demo.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendedoresController {

    @RequestMapping(value = "/GetVendedoers", method = RequestMethod.GET)
    public List<String> GetVendedoers(Date dataInicial, Date dataFinal, int vendedorID) {

        return List.of("Hello", "World!");
    }
}
