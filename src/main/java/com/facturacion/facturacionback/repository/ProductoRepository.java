package com.facturacion.facturacionback.repository;

import com.facturacion.facturacionback.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
