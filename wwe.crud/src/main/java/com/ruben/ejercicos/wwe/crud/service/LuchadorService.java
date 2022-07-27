package com.ruben.ejercicos.wwe.crud.service;

import com.ruben.ejercicos.wwe.crud.entity.Luchador;
import com.ruben.ejercicos.wwe.crud.repository.LuchadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LuchadorService {
    @Autowired
    private LuchadorRepository repository;

    public Luchador saveLuchador(Luchador Luchador) {
        return repository.save(Luchador);
    }

    public List<Luchador> saveLuchadores(List<Luchador> Luchadores) {
        return repository.saveAll(Luchadores);
    }

    public List<Luchador> getLuchadores() {
        return repository.findAll();
    }

    public Luchador getLuchadorByName(String name) {
        return repository.findByName(name);
    }
    
    public Luchador getLuchadorById(int id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteLuchador(int id) {
        repository.deleteById(id);
        return "Luchador removed !! " + id;
    }

    public Luchador updateLuchador(Luchador Luchador) {
        Luchador existingLuchador = repository.findById(Luchador.getId()).orElse(null);
        existingLuchador.setId(Luchador.getId());
        existingLuchador.setName(Luchador.getName());
        existingLuchador.setApellidos(Luchador.getApellidos());
        existingLuchador.setId(Luchador.getId());
        existingLuchador.setEdad(Luchador.getEdad());
        existingLuchador.setRemate(Luchador.getRemate());
        existingLuchador.setCampeon(Luchador.isCampeon());
        existingLuchador.setPeleasGanadas(Luchador.getPeleasGanadas());
        existingLuchador.setMainEventWrestleMania(Luchador.getMainEventWrestleMania());
        existingLuchador.setMedia(Luchador.getMedia());
        return repository.save(existingLuchador);
    }


}