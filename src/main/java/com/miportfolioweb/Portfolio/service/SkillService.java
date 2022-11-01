
package com.miportfolioweb.Portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miportfolioweb.Portfolio.entity.Skill;
import com.miportfolioweb.Portfolio.repository.SkillRepository;
import com.miportfolioweb.Portfolio.service.interfaces.ISkillService;

/* Clase SkillService
 * Gestiona interacción con el repositorio 
 * Skill
*/
@Service
public class SkillService implements ISkillService {
    @Autowired
    private SkillRepository skillRep;

    @Override
    public List<Skill> getSkill() {
        List<Skill> listSkill = skillRep.findAll();
        return listSkill;
    }

    @Override
    public void saveSkill(Skill skill) {
        skillRep.save(skill);
    }

    @Override
    public void deleteSkill(Long id) {
        skillRep.deleteById(id);
    }

    @Override
    public Skill findSkill(Long id) {
        Skill skill = skillRep.findById(id).orElse(null);
        return skill;
    }

    @Override
    public Skill editSkill(Long id, String tag, Double perc) {
        Skill skill = this.findSkill(id);

        skill.setTag(tag);
        skill.setPercentage(perc);
        this.saveSkill(skill);

        return skill;
    }
    
}

