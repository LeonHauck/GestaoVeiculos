package com.faculdade.gestaoveiculos.controller;

import com.faculdade.gestaoveiculos.model.Modelo;
import com.faculdade.gestaoveiculos.repository.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/modelos")
@CrossOrigin("*")
public class ModeloController {

    @Autowired
    private ModeloRepository repository;

    @GetMapping
    public List<Modelo> listar() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<Modelo> criar(@RequestBody Modelo modelo) {
        return ResponseEntity.ok(repository.save(modelo));
    }
}
