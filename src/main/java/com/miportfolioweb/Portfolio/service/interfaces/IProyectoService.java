package com.miportfolioweb.Portfolio.service.interfaces;

import java.util.List;

import com.miportfolioweb.Portfolio.entity.Proyecto;

/* Interfaz IProyectoService
 * Define los métodos principales para la gestión
 * básica de los objetos Proyecto en la BD 
 */
public interface IProyectoService {
    // Leer de la BD los items de educacion
    public List<Proyecto> getProyecto();

    // Guardar datos de educacion
    public void saveProyecto(Proyecto proy);

    // Eliminar datos de educacion
    public void deleteProyecto(Long id);

    // Encontrar un item de educacion
    public Proyecto findProyecto (Long id);

    // Editar item de educacion
    public Proyecto editProyecto (Long id, String title, String content, Long img);
}

