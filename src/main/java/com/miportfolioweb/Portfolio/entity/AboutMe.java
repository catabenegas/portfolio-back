package com.miportfolioweb.Portfolio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


/* Clase AboutMe
 * Guarda los datos "sobre mí"
 */
@Getter @Setter
@Entity
public class AboutMe {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) 
    private int id;
    private String content;
}
