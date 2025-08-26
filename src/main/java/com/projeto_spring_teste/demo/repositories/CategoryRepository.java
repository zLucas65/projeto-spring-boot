package com.projeto_spring_teste.demo.repositories;

import com.projeto_spring_teste.demo.entities.Category;
import com.projeto_spring_teste.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
