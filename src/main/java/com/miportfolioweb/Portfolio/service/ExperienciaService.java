package com.miportfolioweb.Portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miportfolioweb.Portfolio.entity.Experiencia;
import com.miportfolioweb.Portfolio.repository.ExperienciaRepository;
import com.miportfolioweb.Portfolio.service.interfaces.IExperienciaService;

/* Clase ExperienciaService
 * Gestiona interacción con el repositorio 
 * Experiencia
*/
@Service
public class ExperienciaService implements IExperienciaService {
    @Autowired
    private ExperienciaRepository expRep;

    @Override
    public List<Experiencia> getExperiencia() {
        List<Experiencia> listExperiencia = expRep.findAll();
        return listExperiencia;
    }

    @Override
    public void saveExperiencia(Experiencia exp) {
        expRep.save(exp);
    }

    @Override
    public void deleteExperiencia(Long id) {
        expRep.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(Long id) {
        Experiencia exp = expRep.findById(id).orElse(null);
        return exp;
    }

    @Override
    public Experiencia editExperiencia(Long id, String title, String content, Long img) {
        Experiencia exp = this.findExperiencia(id);

        exp.setTitle(title);
        exp.setContent(content);
        exp.setLogo(img);
        this.saveExperiencia(exp);

        return exp;
    }
    
}

