package com.miportfolioweb.Portfolio.controller;

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

import com.miportfolioweb.Portfolio.entity.AboutMe;
import com.miportfolioweb.Portfolio.service.interfaces.IAboutMeService;

/* Clase AboutMeController
 * Toma las peticiones del front-end y
 * responde a ellas con la Interfaz
 * IAboutMeService
 */
@CrossOrigin(origins = "http://miportfolio-8701f.web.app")
@RestController
@RequestMapping("/api/aboutme")
public class AboutMeController {
    
    @Autowired
    private IAboutMeService interAboutMe;

    // Lee los datos ante una petición GET
    @GetMapping("/leer")
    public AboutMe getAboutMe() {
        return interAboutMe.getAboutMe();
    }

    // Guardar datos de un aboutme nuevo ante una petición POST
    @PostMapping("/crear")
    @PreAuthorize("hasRole('ADMIN')")
    public String createAboutMe(@RequestBody AboutMe p) {
        interAboutMe.saveAboutMe(p);
        return "Se creó correctamente";
    }

    // Eliminar datos ante una petición DELETE 
    @DeleteMapping("/borrar/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public String deleteAboutMe(@PathVariable Integer id) {
        interAboutMe.deleteAboutMe(id);
        return "Se eliminó correctamente";
    }

    // Editar datos ante una petición PUT
    @PutMapping ("/editar/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public AboutMe editAboutMe(@PathVariable Integer id, 
                                @RequestBody String txt) {
            return interAboutMe.editAboutMe(id, txt);
    }            
}
