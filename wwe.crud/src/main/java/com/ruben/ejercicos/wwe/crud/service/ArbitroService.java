package com.ruben.ejercicos.wwe.crud.service;

import com.ruben.ejercicos.wwe.crud.entity.Arbitro;
import com.ruben.ejercicos.wwe.crud.repository.ArbitroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArbitroService {
    @Autowired
    private ArbitroRepository repository;

    public Arbitro saveArbitro(Arbitro Arbitro) {
        return repository.save(Arbitro);
    }

    public List<Arbitro> saveArbitros(List<Arbitro> Arbitros) {
        return repository.saveAll(Arbitros);
    }

    public List<Arbitro> getArbitros() {
        return repository.findAll();
    }

    public Arbitro getArbitroByName(String name) {
        return repository.findByName(name);
    }
    
    public Arbitro getArbitroById(int id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteArbitro(int id) {
        repository.deleteById(id);
        return "Arbitro removed !! " + id;
    }

    public Arbitro updateArbitro(Arbitro Arbitro) {
        Arbitro existingArbitro = repository.findById(Arbitro.getId()).orElse(null);
        existingArbitro.setId(Arbitro.getId());
        existingArbitro.setName(Arbitro.getName());
        existingArbitro.setApellidos(Arbitro.getApellidos());
        existingArbitro.setId(Arbitro.getId());
        existingArbitro.setEdad(Arbitro.getEdad());
        existingArbitro.setCamisaRayas(Arbitro.isCamisaRayas());
        existingArbitro.setCombates(Arbitro.getCombates());
        existingArbitro.setComprado(Arbitro.isComprado());
        return repository.save(existingArbitro);
    }
}