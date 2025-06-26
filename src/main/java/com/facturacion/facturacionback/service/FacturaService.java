package com.facturacion.facturacionback.service;

import com.facturacion.facturacionback.model.Factura;
import java.util.List;
import java.util.Optional;

public interface FacturaService {
    Factura save(Factura factura);
    List<Factura> findAll();
    Optional<Factura> findById(Long id);
    void deleteById(Long id);
}
