package com.facturacion.facturacionback.controller;

import com.facturacion.facturacionback.model.Factura;
import com.facturacion.facturacionback.service.FacturaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facturas")
@RequiredArgsConstructor
public class FacturaController {

    private final FacturaService service;

    @GetMapping
    public List<Factura> list() { return service.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<Factura> get(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Factura create(@RequestBody Factura f) { return service.save(f); }

    @PutMapping("/{id}")
    public ResponseEntity<Factura> update(@PathVariable Long id, @RequestBody Factura f) {
        if (!service.findById(id).isPresent()) return ResponseEntity.notFound().build();
        f.setIdFactura(id);
        return ResponseEntity.ok(service.save(f));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!service.findById(id).isPresent()) return ResponseEntity.notFound().build();
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
