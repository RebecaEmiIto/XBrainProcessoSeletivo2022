package com.example.demo;

import java.sql.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendasController {

    @RequestMapping(value = "/PostNovaVenda", method = RequestMethod.GET)
    public List<String> PostNovaVenda() {
        /* Date dateVenda, int valor, int vendedorID, String vendedorNome */
        return List.of("Hello", "World!");
    }
}