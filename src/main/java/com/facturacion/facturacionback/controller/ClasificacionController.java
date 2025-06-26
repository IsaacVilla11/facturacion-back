package com.facturacion.facturacionback.controller;

import com.facturacion.facturacionback.model.Clasificacion;
import com.facturacion.facturacionback.service.ClasificacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clasificaciones")
@RequiredArgsConstructor
public class ClasificacionController {

    private final ClasificacionService service;

    @GetMapping
    public List<Clasificacion> list() { return service.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<Clasificacion> get(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Clasificacion create(@RequestBody Clasificacion c) { return service.save(c); }

    @PutMapping("/{id}")
    public ResponseEntity<Clasificacion> update(@PathVariable Long id, @RequestBody Clasificacion c) {
        if (!service.findById(id).isPresent()) return ResponseEntity.notFound().build();
        c.setIdClasificacion(id);
        return ResponseEntity.ok(service.save(c));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!service.findById(id).isPresent()) return ResponseEntity.notFound().build();
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
