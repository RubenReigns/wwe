package com.ruben.ejercicos.wwe.crud.controller;



import com.ruben.ejercicos.wwe.crud.entity.Combate;
import com.ruben.ejercicos.wwe.crud.service.CombateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("combate")
public class CombateController {

    @Autowired
    private CombateService service;

    @PostMapping("/add")
    public Combate addCombate(@RequestBody Combate Combate) {
        return service.saveCombate(Combate);
    }

    @PostMapping("/addMultiple")
    public List<Combate> addCombatees(@RequestBody List<Combate> Combatees) {
        return service.saveCombatees(Combatees);
    }

    @GetMapping("/get")
    public List<Combate> findAllCombatees() {
        return service.getCombatees();
    }
    
  

    @GetMapping("/{id}")
    public Combate findCombateById(@PathVariable Integer id) {
        return service.getCombateById(id);
    }

    @GetMapping("/{name}")
    public Combate findCombateByName(@PathVariable String name) {
        return service.getCombateByName(name);
    }

    @PutMapping("/update")
    public Combate updateCombate(@RequestBody Combate Combate) {
        return service.updateCombate(Combate);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCombate(@PathVariable Integer id) {
        return service.deleteCombate(id);
    }
}