package com.example.springproject.repository;

import com.example.springproject.entity.Order;
import com.example.springproject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {
    List<Order> findByUserId(String userId);
    List<Order> findByProductId(Long productId);
}
