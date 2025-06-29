package com.facturacion.facturacionback.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.*;

@Entity
@Table(name = "factura")
@Data @NoArgsConstructor
public class Factura {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFactura;

    @Column(length = 13)
    private String ruc;

    private LocalDate fecha;

    //isac//
    /*
    @Column(precision = 10, scale = 2)
    private Double descuento = 0.0;
    */
    //erick
    @Column()
    private Double descuento;

    /*
    @Column(precision = 12, scale = 2)
    private Double total;
     */
    @Column()
    private Double total;

    /* Relaciones */
    @ManyToOne @JoinColumn(name = "id_persona")
    private Persona persona;

    @ManyToOne @JoinColumn(name = "id_tipo_pago")
    private TipoPago tipoPago;

    @OneToMany(mappedBy = "factura", cascade = CascadeType.ALL)
    @com.fasterxml.jackson.annotation.JsonIgnore
    private List<ItemFactura> items = new ArrayList<>();
}
