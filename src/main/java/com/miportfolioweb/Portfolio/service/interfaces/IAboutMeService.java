package com.miportfolioweb.Portfolio.service.interfaces;

import com.miportfolioweb.Portfolio.entity.AboutMe;

/* Interfaz IAboutMeService
 * Define los métodos principales para la gestión
 * básica de los objetos AboutMe en la BD 
 */
public interface IAboutMeService {
    // Leer de la BD la línea de información guardada
    public AboutMe getAboutMe();

    // Guardar datos
    public void saveAboutMe(AboutMe am);

    // Eliminar datos
    public void deleteAboutMe(Integer id);

    // Modificar datos
    public AboutMe editAboutMe(Integer id, String txt);
}
