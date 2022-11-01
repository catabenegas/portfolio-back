package com.miportfolioweb.Portfolio.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/* Clase educación
 * Contiene información sobre el apartado
 * educación
 */
@Getter @Setter
@Entity
public class Educacion {
    @Id
    private Long id;
    private String title;
    private String content;
    private Long logo;
}
