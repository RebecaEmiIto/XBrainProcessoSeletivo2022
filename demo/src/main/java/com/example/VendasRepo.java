package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Vendas;

@Repository
public interface VendasRepo extends JpaRepository<Vendas, Long> {

}
