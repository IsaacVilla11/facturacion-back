package com.facturacion.facturacionback.service.impl;

import com.facturacion.facturacionback.model.ItemFactura;
import com.facturacion.facturacionback.repository.ItemFacturaRepository;
import com.facturacion.facturacionback.service.ItemFacturaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service @RequiredArgsConstructor
@Transactional
public class ItemFacturaServiceImpl implements ItemFacturaService {

    private final ItemFacturaRepository repo;

    public ItemFactura save(ItemFactura i)            { return repo.save(i); }
    public List<ItemFactura> findAll()                { return repo.findAll(); }
    public Optional<ItemFactura> findById(Long id)    { return repo.findById(id); }
    public void deleteById(Long id)                   { repo.deleteById(id); }
}
