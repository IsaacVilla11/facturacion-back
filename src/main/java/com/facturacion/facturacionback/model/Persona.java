package com.facturacion.facturacionback.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Table(name = "persona")
@Data @NoArgsConstructor
public class Persona {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;

    @Column(nullable = false, length = 60)
    private String nombre;

    @Column(length = 60)
    private String apellido;

    @Column(length = 8, unique = true)
    private String dni;

    @Column(length = 15)
    private String celular;

    @Column(length = 120, unique = true)
    private String correo;

    /* Relaciones */
    @OneToOne(mappedBy = "persona")
    @com.fasterxml.jackson.annotation.JsonIgnore
    private Usuario usuario;

    @OneToMany(mappedBy = "persona")
    @com.fasterxml.jackson.annotation.JsonIgnore
    private List<Factura> facturas = new ArrayList<>();
}
