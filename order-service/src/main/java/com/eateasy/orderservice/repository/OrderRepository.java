package com.eateasy.orderservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.eateasy.orderservice.model.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}

