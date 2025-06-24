package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "item_factura")
@Data @NoArgsConstructor
public class ItemFactura {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idItemFactura;

    @Column(nullable = false)
    private Integer cantidad;

    @Column(precision = 10, scale = 2)
    private Double precio;

    @Column(precision = 12, scale = 2)
    private Double subtotal;

    /* Relaciones */
    @ManyToOne @JoinColumn(name = "id_factura")
    private Factura factura;

    @ManyToOne @JoinColumn(name = "id_producto")
    private Producto producto;
}
