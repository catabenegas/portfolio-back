package com.miportfolioweb.Portfolio.service.interfaces;

import java.util.List;

import com.miportfolioweb.Portfolio.entity.Experiencia;

/* Interfaz IExperienciaService
 * Define los métodos principales para la gestión
 * básica de los objetos Experiencia en la BD 
 */
public interface IExperienciaService {
    // Leer de la BD los items de experiencia
    public List<Experiencia> getExperiencia();

    // Guardar datos de experiencia
    public void saveExperiencia(Experiencia exp);

    // Eliminar datos de experiencia
    public void deleteExperiencia(Long id);

    // Encontrar un item de experiencia
    public Experiencia findExperiencia (Long id);

    // Editar item de experiencia
    public Experiencia editExperiencia (Long id, String title, String content, Long img);
}
