package com.example.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Vendas;

public interface VendasRepo extends JpaRepository<Vendas, Integer> {

}
