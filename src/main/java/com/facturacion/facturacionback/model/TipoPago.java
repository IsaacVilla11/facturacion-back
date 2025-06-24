package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tipo_pago")
@Data @NoArgsConstructor
public class TipoPago {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipoPago;

    @Column(nullable = false, length = 40)
    private String tipo;

    @Column(length = 120)
    private String descrip;
}
