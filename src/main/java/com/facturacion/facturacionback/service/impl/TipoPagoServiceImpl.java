package com.facturacion.facturacionback.service.impl;

import com.facturacion.facturacionback.model.TipoPago;
import com.facturacion.facturacionback.repository.TipoPagoRepository;
import com.facturacion.facturacionback.service.TipoPagoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service @RequiredArgsConstructor
@Transactional
public class TipoPagoServiceImpl implements TipoPagoService {

    private final TipoPagoRepository repo;

    public TipoPago save(TipoPago tipoPago) { return repo.save(tipoPago); }
    public List<TipoPago> findAll()          { return repo.findAll(); }
    public Optional<TipoPago> findById(Long id){ return repo.findById(id); }
    public void deleteById(Long id)          { repo.deleteById(id); }
}
