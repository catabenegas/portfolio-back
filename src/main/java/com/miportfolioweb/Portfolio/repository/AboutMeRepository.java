package com.miportfolioweb.Portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miportfolioweb.Portfolio.entity.AboutMe;

@Repository
public interface AboutMeRepository extends JpaRepository <AboutMe, Integer>  {
    
}
