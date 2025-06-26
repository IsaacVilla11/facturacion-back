package com.facturacion.facturacionback.service.impl;

import com.facturacion.facturacionback.model.Factura;
import com.facturacion.facturacionback.repository.FacturaRepository;
import com.facturacion.facturacionback.service.FacturaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service @RequiredArgsConstructor
@Transactional
public class FacturaServiceImpl implements FacturaService {

    private final FacturaRepository repo;

    public Factura save(Factura f)            { return repo.save(f); }
    public List<Factura> findAll()            { return repo.findAll(); }
    public Optional<Factura> findById(Long id){ return repo.findById(id); }
    public void deleteById(Long id)           { repo.deleteById(id); }
}
