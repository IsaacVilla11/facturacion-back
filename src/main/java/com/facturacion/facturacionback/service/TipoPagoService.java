package com.example.demo.service;

import com.example.demo.model.TipoPago;
import java.util.List;
import java.util.Optional;

public interface TipoPagoService {
    TipoPago save(TipoPago tipoPago);
    List<TipoPago> findAll();
    Optional<TipoPago> findById(Long id);
    void deleteById(Long id);
}
