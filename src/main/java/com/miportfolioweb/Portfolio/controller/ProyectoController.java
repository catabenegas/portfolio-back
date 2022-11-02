package com.miportfolioweb.Portfolio.controller;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miportfolioweb.Portfolio.entity.Proyecto;
import com.miportfolioweb.Portfolio.service.interfaces.IProyectoService;
 
/* Clase ProyectoController
 * Toma las peticiones del front-end y
 * responde a ellas con la Interfaz
 * IProyectoService
 */
@RestController
@RequestMapping("/api/proy")
public class ProyectoController {
    
    @Autowired
    private IProyectoService interProyecto;

    // Lee los datos ante una petición GET
    @GetMapping("/leer")
    public List<Proyecto> getProyecto() {
        return interProyecto.getProyecto();
    }

    // Lee los datos de UNA entrada
    @GetMapping("/mostrar/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public Proyecto showProyecto(@PathVariable Long id) {
        return interProyecto.findProyecto(id);
    }

    // Guardar datos de un item nuevo ante una petición POST
    @PostMapping("/crear")
    @PreAuthorize("hasRole('ADMIN')")
    public boolean createProyecto(@RequestBody Proyecto p) {
        interProyecto.saveProyecto(p);
        return true;
    }

    // Eliminar datos ante una petición DELETE
    @DeleteMapping("/borrar/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public boolean deleteProyecto(@PathVariable Long id) {
        interProyecto.deleteProyecto(id);
        return true;
    }

    // Editar datos ante una petición PUT
    @PutMapping ("/editar/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public Proyecto editProyecto(@PathVariable Long id, 
                                @RequestBody Proyecto p) {
            return interProyecto.editProyecto(p.getId(), p.getTitle(), p.getContent(), p.getLogo());
    }            
}
