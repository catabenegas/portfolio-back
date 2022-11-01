package com.miportfolioweb.Portfolio.service.interfaces;

import java.util.List;

import com.miportfolioweb.Portfolio.entity.Educacion;

/* Interfaz IEducacionService
 * Define los métodos principales para la gestión
 * básica de los objetos Educacion en la BD 
 */
public interface IEducacionService {
    // Leer de la BD los items de educacion
    public List<Educacion> getEducacion();

    // Guardar datos de educacion
    public void saveEducacion(Educacion edu);

    // Eliminar datos de educacion
    public void deleteEducacion(Long id);

    // Encontrar un item de educacion
    public Educacion findEducacion (Long id);

    // Editar item de educacion
    public Educacion editEducacion (Long id, String title, String content, Long img);
}
