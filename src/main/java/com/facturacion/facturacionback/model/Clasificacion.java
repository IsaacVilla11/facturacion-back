package com.facturacion.facturacionback.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Table(name = "clasificacion")
@Data @NoArgsConstructor
public class Clasificacion {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClasificacion;

    @Column(length = 60)
    private String grupo;

    @OneToMany(mappedBy = "clasificacion")
    private List<Producto> productos = new ArrayList<>();
}
