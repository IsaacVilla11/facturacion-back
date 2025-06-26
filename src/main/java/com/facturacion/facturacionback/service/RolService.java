package com.facturacion.facturacionback.service;

import com.facturacion.facturacionback.model.Rol;

import java.util.List;
import java.util.Optional;

public interface RolService {
    Rol save(Rol rol);
    List<Rol> findAll();
    Optional<Rol> findById(Long id);
    void deleteById(Long id);
}
