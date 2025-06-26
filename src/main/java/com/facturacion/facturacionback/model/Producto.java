package com.facturacion.facturacionback.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Table(name = "producto")
@Data @NoArgsConstructor
public class Producto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;

    private Integer stock = 0;

    @Column(precision = 10, scale = 2)
    private Double precioUnitario;

    @Column(length = 20)
    private String unidad;

    private Boolean iva;

    /* Relaciones */
    @ManyToOne @JoinColumn(name = "id_clasificacion")
    private Clasificacion clasificacion;

    @ManyToOne @JoinColumn(name = "id_proveedor")
    private Proveedor proveedor;

    @OneToMany(mappedBy = "producto")
    private List<ItemFactura> items = new ArrayList<>();
}
