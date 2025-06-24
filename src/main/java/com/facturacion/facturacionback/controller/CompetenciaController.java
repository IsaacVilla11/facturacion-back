package com.example.demo.controller;

import com.example.demo.model.Competencia;
import com.example.demo.service.CompetenciaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/competencias")
@RequiredArgsConstructor
public class CompetenciaController {

    private final CompetenciaService service;

    @GetMapping
    public List<Competencia> list() { return service.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<Competencia> get(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Competencia create(@RequestBody Competencia c) { return service.save(c); }

    @PutMapping("/{id}")
    public ResponseEntity<Competencia> update(@PathVariable Long id, @RequestBody Competencia c) {
        if (!service.findById(id).isPresent()) return ResponseEntity.notFound().build();
        c.setIdCompetencia(id);
        return ResponseEntity.ok(service.save(c));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!service.findById(id).isPresent()) return ResponseEntity.notFound().build();
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
