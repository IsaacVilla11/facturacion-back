package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "competencia")
@Data @NoArgsConstructor
public class Competencia {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompetencia;

    @Column(nullable = false, length = 60, unique = true)
    private String nombre;

    @Column(length = 120)
    private String descripcion;
}
