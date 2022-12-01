package com.miportfolioweb.Portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miportfolioweb.Portfolio.entity.Educacion;
import com.miportfolioweb.Portfolio.repository.EducacionRepository;
import com.miportfolioweb.Portfolio.service.interfaces.IEducacionService;

/* Clase EducacionService
 * Gestiona interacción con el repositorio 
 * Educacion
*/
@Service
public class EducacionService implements IEducacionService {
    @Autowired
    private EducacionRepository eduRep;

    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> listEducacion = eduRep.findAll();
        return listEducacion;
    }

    @Override
    public void saveEducacion(Educacion edu) {
        eduRep.save(edu);
    }

    @Override
    public void deleteEducacion(Long id) {
        eduRep.deleteById(id);
    }

    @Override
    public Educacion findEducacion(Long id) {
        Educacion edu = eduRep.findById(id).orElse(null);
        return edu;
    }

    @Override
    public Educacion editEducacion(Long id, String title, String content, String urlImg) {
        Educacion edu = this.findEducacion(id);

        edu.setTitle(title);
        edu.setContent(content);
        edu.setLogo(urlImg);
        this.saveEducacion(edu);

        return edu;
    }
    
}
