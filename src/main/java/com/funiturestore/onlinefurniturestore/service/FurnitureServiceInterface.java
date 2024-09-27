package com.funiturestore.onlinefurniturestore.service;

import com.funiturestore.onlinefurniturestore.model.Furniture;

import java.util.List;

public interface FurnitureServiceInterface {
    List<Furniture> getAllFurniture();
    Furniture createNewFurniture(Furniture furniture,Long id);
    Furniture updateExistingFurniture(Furniture furniture,Long id);
    void deleteFurnitureById(Long id);
    void deleteAllFurniture();
}
