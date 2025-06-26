package com.facturacion.facturacionback.service;

import com.facturacion.facturacionback.model.Competencia;
import java.util.List;
import java.util.Optional;

public interface CompetenciaService {
    Competencia save(Competencia competencia);
    List<Competencia> findAll();
    Optional<Competencia> findById(Long id);
    void deleteById(Long id);
}
