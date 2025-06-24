package com.example.demo.service;

import com.example.demo.model.Competencia;
import java.util.List;
import java.util.Optional;

public interface CompetenciaService {
    Competencia save(Competencia competencia);
    List<Competencia> findAll();
    Optional<Competencia> findById(Long id);
    void deleteById(Long id);
}
