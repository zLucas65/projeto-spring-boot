package com.projeto_spring_teste.demo.repositories;

import com.projeto_spring_teste.demo.entities.Category;
import com.projeto_spring_teste.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
