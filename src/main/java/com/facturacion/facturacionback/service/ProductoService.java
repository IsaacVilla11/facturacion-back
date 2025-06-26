package com.facturacion.facturacionback.service;

import com.facturacion.facturacionback.model.Producto;
import java.util.List;
import java.util.Optional;

public interface ProductoService {
    Producto save(Producto producto);
    List<Producto> findAll();
    Optional<Producto> findById(Long id);
    void deleteById(Long id);
}
