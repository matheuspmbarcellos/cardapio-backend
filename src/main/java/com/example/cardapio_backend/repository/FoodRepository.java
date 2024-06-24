package com.example.cardapio_backend.repository;

import com.example.cardapio_backend.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
