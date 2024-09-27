package com.funiturestore.onlinefurniturestore.service;

import com.funiturestore.onlinefurniturestore.model.OrderModel;

import java.util.List;

public interface OrderServiceInterface {
    List<OrderModel> getAllOrders();
    OrderModel createNewOrder(OrderModel order,Long id);
    OrderModel updateExistingOrder(OrderModel order,Long id);
    OrderModel getOrderById(Long id);
    void deleteOrderById(Long id);
    void deleteAllOrders();

}
