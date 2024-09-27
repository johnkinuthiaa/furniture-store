package com.funiturestore.onlinefurniturestore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Furniture {
    @Id
    private Long id;
    private String furnitureName;
    private String furnitureDescription;
    private Float itemRating;
    private String itemsCondition;
    private String furnitureCategory;
    private Double price;

    public Furniture(){}
    public Furniture(Long id,
                     String furnitureName,
                     String furnitureDescription,
                     Float itemRating,
                     String itemsCondition,
                     String furnitureCategory,
                     Double price){
        this.id=id;
        this.furnitureName=furnitureName;
        this.furnitureDescription=furnitureDescription;
        this.itemRating=itemRating;
        this.itemsCondition =itemsCondition;
        this.furnitureCategory=furnitureCategory;
        this.price=price;
    }
    public void setId(Long id){
        this.id=id;
    }
    public Long getId(){
        return id;
    }
    public void setFurnitureName(String furnitureName){
        this.furnitureName=furnitureName;
    }
    public String getFurnitureName(){
        return furnitureName;
    }
    public void setFurnitureDescription(String furnitureDescription){
        this.furnitureDescription=furnitureDescription;
    }
    public String getFurnitureDescription(){
        return furnitureDescription;
    }
    public void setItemRating(Float itemRating){
        this.itemRating=itemRating;
    }
    public Float getItemRating(){
        return itemRating;
    }
    public void setItemsCondition(String itemsCondition){
        this.itemsCondition = itemsCondition;
    }
    public String getItemsCondition(){
        return itemsCondition;
    }
    public void setFurnitureCategory(String furnitureCategory){
        this.furnitureCategory=furnitureCategory;
    }
    public String getFurnitureCategory(){
        return furnitureCategory;
    }
    public void setPrice(Double price){
        this.price=price;
    }
    public Double getPrice(){
        return price;
    }
//    public void setCreatedOn(LocalDate createdOn){
//        this.createdOn=createdOn;
//    }
//    public LocalDate getCreatedOn(){
//        return createdOn;
//    }
}
