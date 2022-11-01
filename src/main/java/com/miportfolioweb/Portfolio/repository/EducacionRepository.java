package com.miportfolioweb.Portfolio.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.miportfolioweb.Portfolio.entity.Educacion;

@Repository
public interface EducacionRepository extends JpaRepository <Educacion, Long> {
    
}
