package com.funiturestore.onlinefurniturestore.repository;

import com.funiturestore.onlinefurniturestore.model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderModel,Long> {
}
