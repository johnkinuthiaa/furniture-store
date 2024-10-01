package com.funiturestore.onlinefurniturestore.controller;

import com.funiturestore.onlinefurniturestore.model.Furniture;
import com.funiturestore.onlinefurniturestore.service.FurnitureServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    @GetMapping("/get/by-name")
    public ResponseEntity<List<Furniture>> getFurnitureByName(@RequestParam String name){
        return new ResponseEntity<>(service.getFurnitureByName(name), HttpStatus.OK);
    }
    @GetMapping("/get/by-condition")
    public ResponseEntity<List<Furniture>> getFurnitureByCondition(@RequestParam String condition){
        return new ResponseEntity<>(service.getFurnitureByCondition(condition),HttpStatus.OK);
    }
    @GetMapping("/get/by-rating")
    public ResponseEntity<List<Furniture>> getFurnitureByRating(@RequestParam Float rating){
        return new ResponseEntity<>(service.getFurnitureByRating(rating),HttpStatus.OK);
    }
    @GetMapping("/get/by-rating")
    public ResponseEntity<List<Furniture>> getFurnitureByPrice(@RequestParam Double price){
        return new ResponseEntity<>(service.getFurnitureByPrice(price),HttpStatus.OK);
    }

    @PostMapping("/add-furniture")
    public ResponseEntity<Furniture> createNewFurniture(@RequestBody Furniture furniture,@RequestParam Long id){
        return new ResponseEntity<>(service.createNewFurniture(furniture,id),HttpStatus.OK);
    }
    @PutMapping("/update-existing-furniture")
    public ResponseEntity<Furniture> updateExistingFurniture(@RequestBody Furniture furniture,@RequestParam Long id){
        return new ResponseEntity<>(service.updateExistingFurniture(furniture,id),HttpStatus.OK) ;
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
