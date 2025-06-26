package com.facturacion.facturacionback.service.impl;

import com.facturacion.facturacionback.model.Proveedor;
import com.facturacion.facturacionback.repository.ProveedorRepository;
import com.facturacion.facturacionback.service.ProveedorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service @RequiredArgsConstructor
@Transactional
public class ProveedorServiceImpl implements ProveedorService {

    private final ProveedorRepository repo;

    public Proveedor save(Proveedor p)        { return repo.save(p); }
    public List<Proveedor> findAll()          { return repo.findAll(); }
    public Optional<Proveedor> findById(Long id){ return repo.findById(id); }
    public void deleteById(Long id)           { repo.deleteById(id); }
}
