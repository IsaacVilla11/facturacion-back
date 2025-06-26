package com.facturacion.facturacionback.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "rol")
@Data @NoArgsConstructor
public class Rol {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol;

    @Column(nullable = false, length = 40, unique = true)
    private String rol;

    private Boolean estado = true;
}
