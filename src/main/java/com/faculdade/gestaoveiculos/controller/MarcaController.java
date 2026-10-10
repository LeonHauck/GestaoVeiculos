package com.faculdade.gestaoveiculos.controller;

import com.faculdade.gestaoveiculos.model.Marca;
import com.faculdade.gestaoveiculos.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/marcas")
@CrossOrigin("*")
public class MarcaController {

    @Autowired
    private MarcaRepository repository;

    @GetMapping
    public List<Marca> listar() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<Marca> criar(@RequestBody Marca marca) {
        return ResponseEntity.ok(repository.save(marca));
    }
}
