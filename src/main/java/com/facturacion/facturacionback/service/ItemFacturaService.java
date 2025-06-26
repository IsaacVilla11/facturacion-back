package com.facturacion.facturacionback.service;

import com.facturacion.facturacionback.model.ItemFactura;
import java.util.List;
import java.util.Optional;

public interface ItemFacturaService {
    ItemFactura save(ItemFactura item);
    List<ItemFactura> findAll();
    Optional<ItemFactura> findById(Long id);
    void deleteById(Long id);
}
