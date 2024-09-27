package com.funiturestore.onlinefurniturestore.controller;

import com.funiturestore.onlinefurniturestore.model.Furniture;
import com.funiturestore.onlinefurniturestore.service.FurnitureServiceInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/furniture")
public class FurnitureController {
    private final FurnitureServiceInterface service;
    public FurnitureController(FurnitureServiceInterface service){
        this.service=service;
    }
    @GetMapping("/all")
    public List<Furniture> getAllFurniture(){
        return service.getAllFurniture();
    }
    @PostMapping("/add-furniture")
    public Furniture createNewFurniture(@RequestBody Furniture furniture,@RequestParam Long id){
        return service.createNewFurniture(furniture,id);
    }
    @PutMapping("/update-existing-furniture")
    public Furniture updateExistingFurniture(@RequestBody Furniture furniture,@RequestParam Long id){
        return service.updateExistingFurniture(furniture,id);
    }
    @DeleteMapping("/Delete-by-id")
    public void deleteFurnitureById(@RequestParam Long id) {
        service.deleteFurnitureById(id);
    }
    @DeleteMapping("/delete/all")
    public void deleteAllFurniture(){
        service.deleteAllFurniture();
    }
}
