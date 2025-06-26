package com.facturacion.facturacionback.service.impl;

import com.facturacion.facturacionback.model.Persona;
import com.facturacion.facturacionback.repository.PersonaRepository;
import com.facturacion.facturacionback.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service @RequiredArgsConstructor
@Transactional
public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository repo;

    public Persona save(Persona p)          { return repo.save(p); }
    public List<Persona> findAll()          { return repo.findAll(); }
    public Optional<Persona> findById(Long id){ return repo.findById(id); }
    public void deleteById(Long id)         { repo.deleteById(id); }
}
