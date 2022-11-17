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

import com.miportfolioweb.Portfolio.entity.Experiencia;
import com.miportfolioweb.Portfolio.service.interfaces.IExperienciaService;

/* Clase ExperienciaController
 * Toma las peticiones del front-end y
 * responde a ellas con la Interfaz
 * IExperienciaService
 */
@CrossOrigin(origins = "https://miportfolio-8701f.web.app")
@RestController
@RequestMapping("/api/exp")
public class ExperienciaController {    
    @Autowired
    private IExperienciaService interExperiencia;

    // Lee los datos ante una petición GET
    @GetMapping("/leer")
    public List<Experiencia> getExperiencia() {
        return interExperiencia.getExperiencia();
    }

    // Lee los datos de UNA entrada
    @GetMapping("/mostrar/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public Experiencia showExperiencia(@PathVariable Long id) {
        return interExperiencia.findExperiencia(id);
    }

    // Guardar datos de un item nuevo ante una petición POST
    @PostMapping("/crear")
    @PreAuthorize("hasRole('ADMIN')")
    public boolean createExperiencia(@RequestBody Experiencia p) {
        interExperiencia.saveExperiencia(p);
        return true;
    }

    // Eliminar datos ante una petición DELETE
    @DeleteMapping("/borrar/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public boolean deleteExperiencia(@PathVariable Long id) {
        interExperiencia.deleteExperiencia(id);
        return true;
    }
 
    // Editar datos ante una petición PUT
    @PutMapping ("/editar/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public Experiencia editExperiencia(@PathVariable Long id, 
                                @RequestBody Experiencia e) {
            return interExperiencia.editExperiencia(e.getId(), e.getTitle(), e.getContent(), e.getLogo());
    }            
}
