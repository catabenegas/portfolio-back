package com.miportfolioweb.Portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miportfolioweb.Portfolio.entity.Proyecto;
import com.miportfolioweb.Portfolio.repository.ProyectoRepository;
import com.miportfolioweb.Portfolio.service.interfaces.IProyectoService;

/* Clase ProyectoService
 * Gestiona interacción con el repositorio 
 * Proyecto
*/
@Service
public class ProyectoService implements IProyectoService {
    @Autowired
    private ProyectoRepository proyectoRep;

    @Override
    public List<Proyecto> getProyecto() {
        List<Proyecto> listProyecto = proyectoRep.findAll();
        return listProyecto;
    }

    @Override
    public void saveProyecto(Proyecto proyecto) {
        proyectoRep.save(proyecto);
    }

    @Override
    public void deleteProyecto(Long id) {
        proyectoRep.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(Long id) {
        Proyecto proyecto = proyectoRep.findById(id).orElse(null);
        return proyecto;
    }

    @Override
    public Proyecto editProyecto(Long id, String title, String content, Long img) {
        Proyecto proyecto = this.findProyecto(id);

        proyecto.setTitle(title);
        proyecto.setContent(content);
        proyecto.setLogo(img);
        this.saveProyecto(proyecto);

        return proyecto;
    }
    
}

