package com.ruben.ejercicos.wwe.crud.repository;

import com.ruben.ejercicos.wwe.crud.entity.Luchador;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LuchadorRepository extends JpaRepository<Luchador,Integer> {
    Luchador findByName(String name);
}