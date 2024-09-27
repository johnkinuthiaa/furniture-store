package com.funiturestore.onlinefurniturestore.repository;

import com.funiturestore.onlinefurniturestore.model.Furniture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FurnitureRepository extends JpaRepository<Furniture,Long> {
}
