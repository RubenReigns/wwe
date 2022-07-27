package com.ruben.ejercicos.wwe.crud.service;

import com.ruben.ejercicos.wwe.crud.entity.Arbitro;
import com.ruben.ejercicos.wwe.crud.entity.Combate;
import com.ruben.ejercicos.wwe.crud.entity.Luchador;
import com.ruben.ejercicos.wwe.crud.repository.CombateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CombateService  {
    @Autowired
    private CombateRepository repository;

    public Combate saveCombate(Combate Combate) {
        return repository.save(Combate);
    }

    public List<Combate> saveCombatees(List<Combate> Combatees) {
        return repository.saveAll(Combatees);
    }

    public List<Combate> getCombatees() {
        return repository.findAll();
    }

    public Combate getCombateByName(String name) {
        return repository.findByName(name);
    }
    
    public Combate getCombateById(int id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteCombate(int id) {
        repository.deleteById(id);
        return "Combate removed !! " + id;
    }

    public Combate updateCombate(Combate Combate) {
        Combate existingCombate = repository.findById(Combate.getId()).orElse(null);
        existingCombate.setId(Combate.getId());
        existingCombate.setName(Combate.getName());
        existingCombate.setLuchador1(Combate.getLuchador1());
        existingCombate.setId(Combate.getId());
        existingCombate.setLuchador2(Combate.getLuchador2());
        existingCombate.setArbitro(Combate.getArbitro());
        return repository.save(existingCombate);
    }
}