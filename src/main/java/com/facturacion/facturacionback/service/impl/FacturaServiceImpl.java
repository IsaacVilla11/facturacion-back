package com.example.demo.service.impl;

import com.example.demo.model.Factura;
import com.example.demo.repository.FacturaRepository;
import com.example.demo.service.FacturaService;
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
