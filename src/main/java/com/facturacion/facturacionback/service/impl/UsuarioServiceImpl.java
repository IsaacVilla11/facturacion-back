package com.facturacion.facturacionback.service.impl;

import com.facturacion.facturacionback.model.Usuario;
import com.facturacion.facturacionback.repository.UsuarioRepository;
import com.facturacion.facturacionback.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service @RequiredArgsConstructor
@Transactional
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository repo;

    public Usuario save(Usuario usuario)           { return repo.save(usuario); }
    public List<Usuario> findAll()           { return repo.findAll(); }
    public Optional<Usuario> findById(Long id){ return repo.findById(id); }
    public Optional<Usuario> findByUser(String user){ return repo.findByUser(user); }
    public void deleteById(Long id)          { repo.deleteById(id); }
}
