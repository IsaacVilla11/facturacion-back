package com.facturacion.facturacionback.controller;

import com.facturacion.facturacionback.model.Producto;
import com.facturacion.facturacionback.service.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
@RequiredArgsConstructor
public class ProductoController {

    private final ProductoService service;

    @GetMapping
    public List<Producto> list() { return service.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> get(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Producto create(@RequestBody Producto p) { return service.save(p); }

    @PutMapping("/{id}")
    public ResponseEntity<Producto> update(@PathVariable Long id, @RequestBody Producto p) {
        if (!service.findById(id).isPresent()) return ResponseEntity.notFound().build();
        p.setIdProducto(id);
        return ResponseEntity.ok(service.save(p));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!service.findById(id).isPresent()) return ResponseEntity.notFound().build();
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
