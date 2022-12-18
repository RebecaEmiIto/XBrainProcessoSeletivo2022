package com.example.demo;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.repositorio.VendasRepo;

@SpringBootApplication
@ComponentScan("com.text.demo.controller")
@RestController
public class DemoApplication {

	@Autowired
	private VendasRepo vendasRepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello World!");
	}

	@RequestMapping(value = "/PostNovaVenda", method = RequestMethod.GET)
	public String PostNovaVenda(String valor, Long vendedorID, String nome) throws IOException {
		/* Date dateVenda, int valor, int vendedorID, String vendedorNome */
		Vendas novaVenda = new Vendas();
		novaVenda.gravarNovaVenda(valor, vendedorID, nome);
		vendasRepo.saveAll(Arrays.asList(novaVenda));
		return "Venda de " + valor + " incluíco com sucesso, com o/a vendedor(a) " + nome;
	}

	@RequestMapping(value = "/GetVendedoers", method = RequestMethod.GET)
	public List<String> GetVendedoers(Date dataInicial, Date dataFinal, int vendedorID) {
		return List.of("Hello", "World!");
	}
}
