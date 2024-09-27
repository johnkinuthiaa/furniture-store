package com.funiturestore.onlinefurniturestore.service;

import com.funiturestore.onlinefurniturestore.model.OrderModel;
import com.funiturestore.onlinefurniturestore.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class OrderService implements OrderServiceInterface{
    private final OrderRepository repository;
    public OrderService(OrderRepository repository){
        this.repository=repository;
    }
    @Override
    public List<OrderModel> getAllOrders(){
        if(repository.findAll().isEmpty()){
            throw new RuntimeException("order list is empty");
        }
        return repository.findAll();
    }
    @Override
    public OrderModel createNewOrder(OrderModel order,Long id){
        if(repository.findById(id).isPresent()){
            throw new RuntimeException("order already exists");
        }
        return repository.save(order);
    }
    @Override
    public OrderModel updateExistingOrder(OrderModel order,Long id){
        if(repository.findById(id).isEmpty()){
            throw new RuntimeException("order DOES NOT EXIST");
        }else if(repository.findById(id).isPresent()){
            repository.delete(order);
        }
        return repository.save(order);
    }
    @Override
    public OrderModel getOrderById(Long id){
        if(repository.findById(id).isEmpty()){
            throw new RuntimeException("no order with the '"+id +"'was found");
        }
        return repository.findById(id).orElse(null);
    }
    @Override
    public void deleteOrderById(Long id){
        if(repository.findById(id).isEmpty()){
            throw new RuntimeException("no order with the '"+id +"'was found");
        }else {
            repository.deleteById(id);
        }
    }

    @Override
    public void deleteAllOrders(){
        if(repository.findAll().isEmpty()){
            throw new RuntimeException("order list is empty");
        }else{
            repository.deleteAll();
        }
    }
}
