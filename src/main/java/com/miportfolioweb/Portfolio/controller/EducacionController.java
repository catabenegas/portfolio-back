package com.miportfolioweb.Portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miportfolioweb.Portfolio.entity.Educacion;
import com.miportfolioweb.Portfolio.service.interfaces.IEducacionService;
 
/* Clase EducacionController
 * Toma las peticiones del front-end y
 * responde a ellas con la Interfaz
 * IEducacionService
 */ 
@CrossOrigin(origins = "https://miportfolio-8701f.web.app")
@RestController
@RequestMapping("/api/edu")
public class EducacionController {    
    @Autowired
    private IEducacionService interEducacion;

    // Lee los datos ante una petición GET
    @GetMapping("/leer")
    public List<Educacion> getEducacion() {
        return interEducacion.getEducacion();
    }

    // Lee los datos de UNA entrada
    @GetMapping("/mostrar/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public Educacion showEducacion(@PathVariable Long id) {
        return interEducacion.findEducacion(id);
    }

    // Guardar datos de una entrada nueva ante una petición POST
    @PostMapping("/crear")
    @PreAuthorize("hasRole('ADMIN')")
    public boolean createEducacion(@RequestBody Educacion p) {
        interEducacion.saveEducacion(p);
        return true;
    }

    // Eliminar datos ante una petición DELETE
    @DeleteMapping("/borrar/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public boolean deleteEducacion(@PathVariable Long id) {
        interEducacion.deleteEducacion(id);
        return true;
    }

    // Editar datos ante una petición PUT
    @PutMapping ("/editar/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public Educacion editEducacion(@PathVariable Long id, 
                                @RequestBody Educacion ed) {
            return interEducacion.editEducacion(ed.getId(), ed.getTitle(), ed.getContent(), ed.getLogo());
    }            
}

