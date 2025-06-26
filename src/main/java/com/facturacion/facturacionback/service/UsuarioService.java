package com.facturacion.facturacionback.service;

import com.facturacion.facturacionback.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    Usuario save(Usuario usuario);
    List<Usuario> findAll();
    Optional<Usuario> findById(Long id);
    void deleteById(Long id);
}
