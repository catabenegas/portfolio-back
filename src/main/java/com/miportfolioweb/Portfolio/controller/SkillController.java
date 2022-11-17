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

import com.miportfolioweb.Portfolio.entity.Skill;
import com.miportfolioweb.Portfolio.service.interfaces.ISkillService;

/* Clase SkillController
 * Toma las peticiones del front-end y
 * responde a ellas con la Interfaz
 * ISkillService
 */
@CrossOrigin(origins = "http://miportfolio-8701f.web.app")
@RestController
@RequestMapping("/api/skill")
public class SkillController {
    @Autowired
    private ISkillService interSkill;

    // Lee los datos ante una petición GET
    @GetMapping("/leer")
    public List<Skill> getSkill() {
        return interSkill.getSkill();
    }

    // Lee los datos de una skill
    @GetMapping("/mostrar/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public Skill showSkill(@PathVariable Long id) {
        return interSkill.findSkill(id);
    }

    // Guardar datos de un item nuevo ante una petición POST
    @PostMapping("/crear")
    @PreAuthorize("hasRole('ADMIN')")
    public boolean createSkill(@RequestBody Skill p) {
        interSkill.saveSkill(p);
        return true;
    }

    // Eliminar datos ante una petición DELETE
    @DeleteMapping("/borrar/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public boolean deleteSkill(@PathVariable Long id) {
        interSkill.deleteSkill(id);
        return true;
    }

    // Editar datos ante una petición PUT
    @PutMapping ("/editar/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public Skill editSkill(@PathVariable Long id, 
                                @RequestBody Skill s) {
            return interSkill.editSkill(s.getId(), s.getTag(), s.getPercentage());
    }            
}
