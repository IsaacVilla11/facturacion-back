package com.facturacion.facturacionback.controller;

import com.facturacion.facturacionback.model.ItemFactura;
import com.facturacion.facturacionback.service.ItemFacturaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/item-facturas")
@RequiredArgsConstructor
public class ItemFacturaController {

    private final ItemFacturaService service;

    @GetMapping
    public List<ItemFactura> list() { return service.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<ItemFactura> get(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ItemFactura create(@RequestBody ItemFactura i) { return service.save(i); }

    @PutMapping("/{id}")
    public ResponseEntity<ItemFactura> update(@PathVariable Long id, @RequestBody ItemFactura i) {
        if (!service.findById(id).isPresent()) return ResponseEntity.notFound().build();
        i.setIdItemFactura(id);
        return ResponseEntity.ok(service.save(i));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!service.findById(id).isPresent()) return ResponseEntity.notFound().build();
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
