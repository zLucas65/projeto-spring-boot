package com.projeto_spring_teste.demo.repositories;

import com.projeto_spring_teste.demo.entities.OrderItem;
import com.projeto_spring_teste.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
