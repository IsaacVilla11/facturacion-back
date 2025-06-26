package com.facturacion.facturacionback.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Table(name = "proveedor")
@Data @NoArgsConstructor
public class Proveedor {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProveedor;

    @Column(length = 13, unique = true)
    private String ruc;

    @Column(length = 20)
    private String telefono;

    @Column(length = 40)
    private String pais;

    @Column(length = 120)
    private String correo;

    @Column(length = 80)
    private String nombre;

    @OneToMany(mappedBy = "proveedor")
    private List<Producto> productos = new ArrayList<>();
}
