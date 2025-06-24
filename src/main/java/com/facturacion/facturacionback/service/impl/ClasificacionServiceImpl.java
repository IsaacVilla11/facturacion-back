package com.example.demo.service.impl;

import com.example.demo.model.Clasificacion;
import com.example.demo.repository.ClasificacionRepository;
import com.example.demo.service.ClasificacionService;
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
