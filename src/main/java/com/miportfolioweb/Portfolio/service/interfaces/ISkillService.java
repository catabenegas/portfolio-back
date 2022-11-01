package com.miportfolioweb.Portfolio.service.interfaces;

import java.util.List;

import com.miportfolioweb.Portfolio.entity.Skill;

/* Interfaz ISkillService
 * Define los métodos principales para la gestión
 * básica de los objetos Skill en la BD 
 */
public interface ISkillService {
    // Leer de la BD los items de skill
    public List<Skill> getSkill();

    // Guardar datos de skill
    public void saveSkill(Skill skill);

    // Eliminar datos de skill
    public void deleteSkill(Long id);

    // Encontrar un item de skill
    public Skill findSkill (Long id);

    // Editar item de skill
    public Skill editSkill (Long id, String tag, Double perc);
}
