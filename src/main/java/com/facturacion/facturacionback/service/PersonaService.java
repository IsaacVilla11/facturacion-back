package com.example.demo.service;

import com.example.demo.model.Persona;
import java.util.List;
import java.util.Optional;

public interface PersonaService {
    Persona save(Persona persona);
    List<Persona> findAll();
    Optional<Persona> findById(Long id);
    void deleteById(Long id);
}
