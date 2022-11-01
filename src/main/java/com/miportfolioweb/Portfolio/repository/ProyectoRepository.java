package com.miportfolioweb.Portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miportfolioweb.Portfolio.entity.Proyecto;

@Repository
public interface ProyectoRepository extends JpaRepository <Proyecto, Long> {
    
}
