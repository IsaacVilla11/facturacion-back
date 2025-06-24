package com.example.demo.controller;

import com.example.demo.model.TipoPago;
import com.example.demo.service.TipoPagoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipo-pagos")
@RequiredArgsConstructor
public class TipoPagoController {

    private final TipoPagoService service;

    @GetMapping
    public List<TipoPago> list() { return service.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<TipoPago> get(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public TipoPago create(@RequestBody TipoPago t) { return service.save(t); }

    @PutMapping("/{id}")
    public ResponseEntity<TipoPago> update(@PathVariable Long id, @RequestBody TipoPago t) {
        if (!service.findById(id).isPresent()) return ResponseEntity.notFound().build();
        t.setIdTipoPago(id);
        return ResponseEntity.ok(service.save(t));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!service.findById(id).isPresent()) return ResponseEntity.notFound().build();
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
