package com.ruben.ejercicos.wwe.crud.repository;

import com.ruben.ejercicos.wwe.crud.entity.Arbitro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArbitroRepository extends JpaRepository<Arbitro,Integer> {
    Arbitro findByName(String name);
}