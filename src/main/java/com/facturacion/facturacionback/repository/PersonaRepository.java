package com.facturacion.facturacionback.repository;

import com.facturacion.facturacionback.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> { }
