package com.miportfolioweb.Portfolio.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/* Clase proyecto
 * Contiene información sobre el apartado
 * proyecto
 */
@Getter @Setter
@Entity 
public class Proyecto {
    @Id
    private Long id;
    private String title;
    private String content;
    private String logo;
}

