package com.ruben.ejercicos.wwe.crud.controller;

import com.ruben.ejercicos.wwe.crud.entity.Luchador;
import com.ruben.ejercicos.wwe.crud.service.LuchadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/luchador")
public class LuchadorController {

    @Autowired
    private LuchadorService service;

    @PostMapping("/add")
    public Luchador addLuchador(@RequestBody Luchador Luchador) {
        return service.saveLuchador(Luchador);
    }

    @PostMapping("/addMultiple")
    public List<Luchador> addLuchadores(@RequestBody List<Luchador> Luchadores) {
        return service.saveLuchadores(Luchadores);
    }

    @GetMapping("/get")
    public List<Luchador> findAllLuchadores() {
        return service.getLuchadores();
    }
    
  

    @GetMapping("/{id}")
    public Luchador findLuchadorById(@PathVariable Integer id) {
        return service.getLuchadorById(id);
    }

    @GetMapping("/{name}")
    public Luchador findLuchadorByName(@PathVariable String name) {
        return service.getLuchadorByName(name);
    }

    @PutMapping("/update")
    public Luchador updateLuchador(@RequestBody Luchador Luchador) {
        return service.updateLuchador(Luchador);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteLuchador(@PathVariable Integer id) {
        return service.deleteLuchador(id);
    }
}