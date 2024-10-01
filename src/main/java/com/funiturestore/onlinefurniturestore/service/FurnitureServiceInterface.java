package com.funiturestore.onlinefurniturestore.service;

import com.funiturestore.onlinefurniturestore.model.Furniture;

import java.util.List;

public interface FurnitureServiceInterface {
    List<Furniture> getAllFurniture();
    List<Furniture> getFurnitureByName(String name);
    List<Furniture> getFurnitureByCondition(String condition);
    List<Furniture> getFurnitureByRating(Float rating);
    List<Furniture> getFurnitureByPrice(Double price);
    Furniture createNewFurniture(Furniture furniture,Long id);
    Furniture updateExistingFurniture(Furniture furniture,Long id);
    void deleteFurnitureById(Long id);
    void deleteAllFurniture();
}
