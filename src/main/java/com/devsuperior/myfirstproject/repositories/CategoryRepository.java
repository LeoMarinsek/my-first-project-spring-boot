package com.devsuperior.myfirstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.myfirstproject.entities.Category;

@Repository   // Mecanismo de injeção de dependências do Spring Boot
public interface CategoryRepository extends JpaRepository<Category, Long> {

}