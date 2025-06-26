package com.facturacion.facturacionback.service;

import com.facturacion.facturacionback.model.Proveedor;
import java.util.List;
import java.util.Optional;

public interface ProveedorService {
    Proveedor save(Proveedor proveedor);
    List<Proveedor> findAll();
    Optional<Proveedor> findById(Long id);
    void deleteById(Long id);
}
