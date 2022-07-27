package com.ruben.ejercicos.wwe.crud.controller;

import com.ruben.ejercicos.wwe.crud.entity.Arbitro;
import com.ruben.ejercicos.wwe.crud.service.ArbitroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("arbitro")
public class ArbitroController {
	
    @Autowired
    private ArbitroService service;

    @PostMapping("/add")
    public Arbitro addArbitro(@RequestBody Arbitro Arbitro) {
        return service.saveArbitro(Arbitro);
    }

    @PostMapping("/addMultiple")
    public List<Arbitro> addArbitros(@RequestBody List<Arbitro> Arbitros) {
        return service.saveArbitros(Arbitros);
    }

    @GetMapping("/get")
    public List<Arbitro> findAllArbitros() {
        return service.getArbitros();
    }
    

    @GetMapping("/{id}")
    public Arbitro findArbitroById(@PathVariable Integer id) {
        return service.getArbitroById(id);
    }

    @GetMapping("/{name}")
    public Arbitro findArbitroByName(@PathVariable String name) {
        return service.getArbitroByName(name);
    }

    @PutMapping("/update")
    public Arbitro updateArbitro(@RequestBody Arbitro Arbitro) {
        return service.updateArbitro(Arbitro);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteArbitro(@PathVariable Integer id) {
        return service.deleteArbitro(id);
    }
}