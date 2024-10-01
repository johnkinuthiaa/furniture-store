package com.funiturestore.onlinefurniturestore.service;

import com.funiturestore.onlinefurniturestore.model.Furniture;
import com.funiturestore.onlinefurniturestore.repository.FurnitureRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FurnitureService implements FurnitureServiceInterface{
    private final FurnitureRepository repository;

    public FurnitureService(FurnitureRepository repository){
        this.repository=repository;
    }
    @Override
    public List<Furniture> getAllFurniture(){
        if(repository.findAll().isEmpty()){
            throw new RuntimeException("furniture list is empty");
        }
        return repository.findAll();
    }
    @Override
    public Furniture createNewFurniture(Furniture furniture,Long id){
        if(repository.findById(id).isPresent()){
            throw new RuntimeException("furniture already exist");
        }
        return repository.save(furniture);
    }
    @Override
    public Furniture updateExistingFurniture(Furniture furniture,Long id){
        if(repository.findById(id).isPresent()){
            repository.delete(furniture);
        }
        return repository.save(furniture);
    }
    @Override
    public void deleteFurnitureById(Long id) {
        if (repository.findById(id).isEmpty()) {
            throw new RuntimeException("no furniture with given id was found");
        }else {
            repository.deleteById(id);
        }
    }

    @Override
    public void deleteAllFurniture() throws RuntimeException{
        if(repository.findAll().isEmpty()){
            throw new RuntimeException("furniture list is  already empty");
        }else {
            repository.deleteAll();
        }
    }
    @Override
    public List<Furniture> getFurnitureByName(String name){
        return repository.findAll().stream()
                .filter(furniture ->furniture.getFurnitureName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }
    @Override
    public List<Furniture> getFurnitureByCondition(String condition){
        return repository.findAll().stream()
                .filter(furniture ->furniture.getItemsCondition().toLowerCase().contains(condition.toLowerCase()))
                .collect(Collectors.toList());
    }
    @Override
    public List<Furniture> getFurnitureByRating(Float rating){
        return repository.findAll().stream()
                .filter(furniture -> furniture.getItemRating().equals(rating))
                .collect(Collectors.toList());
    }
    @Override
    public List<Furniture> getFurnitureByPrice(Double price){
        return repository.findAll().stream()
                .filter(furniture -> furniture.getPrice().equals(price))
                .collect(Collectors.toList());
    }

}
