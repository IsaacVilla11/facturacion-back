package com.example.demo.service.impl;

import com.example.demo.model.Producto;
import com.example.demo.repository.ProductoRepository;
import com.example.demo.service.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service @RequiredArgsConstructor
@Transactional
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository repo;

    public Producto save(Producto p)          { return repo.save(p); }
    public List<Producto> findAll()           { return repo.findAll(); }
    public Optional<Producto> findById(Long id){ return repo.findById(id); }
    public void deleteById(Long id)           { repo.deleteById(id); }
}
