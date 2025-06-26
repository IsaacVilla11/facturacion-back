package com.facturacion.facturacionback.service.impl;

import com.facturacion.facturacionback.model.Rol;
import com.facturacion.facturacionback.repository.RolRepository;
import com.facturacion.facturacionback.service.RolService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service @RequiredArgsConstructor
@Transactional
public class RolServiceImpl implements RolService {

    private final RolRepository repo;

    public Rol save(Rol r)                   { return repo.save(r); }
    public List<Rol> findAll()               { return repo.findAll(); }
    public Optional<Rol> findById(Long id)   { return repo.findById(id); }
    public void deleteById(Long id)          { repo.deleteById(id); }
}
