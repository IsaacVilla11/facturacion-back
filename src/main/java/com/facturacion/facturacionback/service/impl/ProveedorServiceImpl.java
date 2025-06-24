package com.example.demo.service.impl;

import com.example.demo.model.Proveedor;
import com.example.demo.repository.ProveedorRepository;
import com.example.demo.service.ProveedorService;
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
