package com.miportfolioweb.Portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miportfolioweb.Portfolio.entity.AboutMe;
import com.miportfolioweb.Portfolio.repository.AboutMeRepository;
import com.miportfolioweb.Portfolio.service.interfaces.IAboutMeService;

/* Clase AboutMeService
 * Gestiona interacción con el repositorio 
 * About Me
*/
@Service
public class AboutMeService implements IAboutMeService {
    @Autowired
    private AboutMeRepository amRepository;

    @Override
    public AboutMe getAboutMe() {
        AboutMe aboutMe = amRepository.findById(1).orElse(null);
        return aboutMe;
    }

    @Override
    public void saveAboutMe(AboutMe am) {
        amRepository.save(am);
    }

    @Override
    public void deleteAboutMe(Integer id) {
        amRepository.deleteById(id);
    }

    @Override
    public AboutMe editAboutMe(Integer id, String txt) {
       AboutMe am = amRepository.findById(id).orElse(null);
       am.setContent(txt);  
       this.saveAboutMe(am);
       return am;       
    }
}
