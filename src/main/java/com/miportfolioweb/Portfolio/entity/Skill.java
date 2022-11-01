package com.miportfolioweb.Portfolio.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/* Clase skill
 * Contiene información sobre el apartado
 * skill
 */
@Getter @Setter
@Entity
public class Skill {
    @Id
    private Long id;
    private String tag;
    private Double percentage;
}

