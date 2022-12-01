package com.miportfolioweb.Portfolio.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/* Clase experiencia
 * Contiene información sobre el apartado
 * experiencia
 */
@Getter @Setter
@Entity
public class Experiencia {
    @Id
    private Long id;
    private String title;
    private String content;
    private String logo; 
}