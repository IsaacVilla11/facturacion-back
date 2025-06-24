package com.example.demo.service;

import com.example.demo.model.ItemFactura;
import java.util.List;
import java.util.Optional;

public interface ItemFacturaService {
    ItemFactura save(ItemFactura item);
    List<ItemFactura> findAll();
    Optional<ItemFactura> findById(Long id);
    void deleteById(Long id);
}
