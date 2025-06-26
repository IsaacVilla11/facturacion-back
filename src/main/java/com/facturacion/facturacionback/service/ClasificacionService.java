package com.facturacion.facturacionback.service;

import com.facturacion.facturacionback.model.Clasificacion;
import java.util.List;
import java.util.Optional;

public interface ClasificacionService {
    Clasificacion save(Clasificacion clasificacion);
    List<Clasificacion> findAll();
    Optional<Clasificacion> findById(Long id);
    void deleteById(Long id);
}
