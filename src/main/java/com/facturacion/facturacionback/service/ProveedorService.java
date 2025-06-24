package com.example.demo.service;

import com.example.demo.model.Proveedor;
import java.util.List;
import java.util.Optional;

public interface ProveedorService {
    Proveedor save(Proveedor proveedor);
    List<Proveedor> findAll();
    Optional<Proveedor> findById(Long id);
    void deleteById(Long id);
}
