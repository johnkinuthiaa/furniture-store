package com.funiturestore.onlinefurniturestore.controller;

import com.funiturestore.onlinefurniturestore.model.OrderModel;
import com.funiturestore.onlinefurniturestore.service.OrderServiceInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/orders")
public class OrderController {
    private final OrderServiceInterface service;
    public OrderController(OrderServiceInterface service){
        this.service=service;
    }
    @GetMapping("/all")
    public List<OrderModel> getAllOrders(){
        return service.getAllOrders();
    }
    @PostMapping("/create-new-order")
    public OrderModel createNewOrder(@RequestBody OrderModel order,@RequestParam Long id){
        return service.createNewOrder(order,id);
    }
    @PutMapping("/update-by-id")
    public OrderModel updateExistingOrder(@RequestBody OrderModel order,@RequestParam Long id){
        return service.updateExistingOrder(order,id);
    }
    @GetMapping("/get-order-by-id")
    public OrderModel getOrderById(@RequestParam Long id){
        return service.getOrderById(id);
    }
    @DeleteMapping("/delete-order-by-id")
    public void deleteOrderById(@RequestParam Long id){
        service.deleteOrderById(id);
    }
    @DeleteMapping("/delete-all-orders")
    public void deleteAllOrders(){
        service.deleteAllOrders();
    }
}
