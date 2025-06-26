package com.facturacion.facturacionback.repository;

import com.facturacion.facturacionback.model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura, Long> {
}
