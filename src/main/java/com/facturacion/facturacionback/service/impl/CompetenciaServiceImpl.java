package com.facturacion.facturacionback.service.impl;

import com.facturacion.facturacionback.model.Competencia;
import com.facturacion.facturacionback.repository.CompetenciaRepository;
import com.facturacion.facturacionback.service.CompetenciaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service @RequiredArgsConstructor
@Transactional
public class CompetenciaServiceImpl implements CompetenciaService {

    private final CompetenciaRepository repo;

    public Competencia save(Competencia c)           { return repo.save(c); }
    public List<Competencia> findAll()               { return repo.findAll(); }
    public Optional<Competencia> findById(Long id)   { return repo.findById(id); }
    public void deleteById(Long id)                  { repo.deleteById(id); }
}
