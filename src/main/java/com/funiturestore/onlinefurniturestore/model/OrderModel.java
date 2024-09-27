package com.funiturestore.onlinefurniturestore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class OrderModel {
    @Id
    private Long id;
    private LocalDate createdOn;
    private String orderStatus;

    public OrderModel(){}
    public OrderModel(Long id,LocalDate createdOn,String orderStatus){
        this.id=id;
        this.createdOn=createdOn;
        this.orderStatus=orderStatus;

    }
    public void setId(Long id){
        this.id=id;
    }
    public Long getId(){
        return id;
    }
    public void setCreatedOn(LocalDate createdOn){
        this.createdOn=createdOn;
    }
    public LocalDate getCreatedOn(){
        return createdOn;
    }
    public void setOrderStatus(String orderStatus){
        this.orderStatus=orderStatus;
    }
    public String getOrderStatus(){
        return orderStatus;
    }

}
