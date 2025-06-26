package com.facturacion.facturacionback.service;

import com.facturacion.facturacionback.model.TipoPago;
import java.util.List;
import java.util.Optional;

public interface TipoPagoService {
    TipoPago save(TipoPago tipoPago);
    List<TipoPago> findAll();
    Optional<TipoPago> findById(Long id);
    void deleteById(Long id);
}
