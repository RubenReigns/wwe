package com.ruben.ejercicos.wwe.crud.repository;

import com.ruben.ejercicos.wwe.crud.entity.Combate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CombateRepository extends JpaRepository<Combate,Integer> {
    Combate findByName(String name);
}