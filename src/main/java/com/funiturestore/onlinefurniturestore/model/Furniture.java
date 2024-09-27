package com.funiturestore.onlinefurniturestore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Furniture {
    @Id
    private Long id;
    private String name;
    private String description;
    private Float rating;
    private String condition;
    private Double price;
    private LocalDate createdOn;

    public Furniture(){}
    public Furniture(Long id,String name,String description,Float rating,String condition,Double price,LocalDate createdOn){
        this.id=id;
        this.name=name;
        this.description=description;
        this.rating=rating;
        this.condition=condition;
        this.price=price;
        this.createdOn=createdOn;
    }
    public void setId(Long id){
        this.id=id;
    }
    public Long getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
    public void setRating(Float rating){
        this.rating=rating;
    }
    public Float getRating(){
        return rating;
    }
    public void setCondition(String condition){
        this.condition=condition;
    }
    public String getCondition(){
        return condition;
    }
    public void setPrice(Double price){
        this.price=price;
    }
    public Double getPrice(){
        return price;
    }
    public void setCreatedOn(LocalDate createdOn){
        this.createdOn=createdOn;
    }
    public LocalDate getCreatedOn(){
        return createdOn;
    }
}
