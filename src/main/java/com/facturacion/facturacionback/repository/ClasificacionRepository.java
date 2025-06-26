package com.facturacion.facturacionback.repository;

import com.facturacion.facturacionback.model.Clasificacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClasificacionRepository extends JpaRepository<Clasificacion, Long> {
}
