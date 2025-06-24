package com.example.demo.service.impl;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;
import com.example.demo.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service @RequiredArgsConstructor
@Transactional
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository repo;

    public Usuario save(Usuario u)           { return repo.save(u); }
    public List<Usuario> findAll()           { return repo.findAll(); }
    public Optional<Usuario> findById(Long id){ return repo.findById(id); }
    public Optional<Usuario> findByUser(String user){ return repo.findByUser(user); }
    public void deleteById(Long id)          { repo.deleteById(id); }
}
