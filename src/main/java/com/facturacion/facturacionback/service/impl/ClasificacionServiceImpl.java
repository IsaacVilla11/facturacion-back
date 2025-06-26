package com.facturacion.facturacionback.service.impl;

import com.facturacion.facturacionback.model.Clasificacion;
import com.facturacion.facturacionback.repository.ClasificacionRepository;
import com.facturacion.facturacionback.service.ClasificacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service @RequiredArgsConstructor
@Transactional
public class ClasificacionServiceImpl implements ClasificacionService {

    private final ClasificacionRepository repo;

    public Clasificacion save(Clasificacion c)         { return repo.save(c); }
    public List<Clasificacion> findAll()               { return repo.findAll(); }
    public Optional<Clasificacion> findById(Long id)   { return repo.findById(id); }
    public void deleteById(Long id)                    { repo.deleteById(id); }
}
