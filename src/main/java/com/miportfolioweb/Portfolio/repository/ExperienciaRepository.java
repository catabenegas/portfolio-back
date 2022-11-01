package com.miportfolioweb.Portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miportfolioweb.Portfolio.entity.Experiencia;

@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia, Long> {
    
}
