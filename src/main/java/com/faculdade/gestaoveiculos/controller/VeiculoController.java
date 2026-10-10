package com.faculdade.gestaoveiculos.controller;

import com.faculdade.gestaoveiculos.model.Veiculo;
import com.faculdade.gestaoveiculos.model.StatusDisponibilidade;
import com.faculdade.gestaoveiculos.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
@CrossOrigin("*")
public class VeiculoController {

    @Autowired
    private VeiculoService service;

    @GetMapping
    public List<Veiculo> listar(
            @RequestParam(required = false) Long marcaId,
            @RequestParam(required = false) Long modeloId,
            @RequestParam(required = false) Integer ano,
            @RequestParam(required = false) BigDecimal precoMax,
            @RequestParam(required = false) StatusDisponibilidade status) {
        return service.findAll(marcaId, modeloId, ano, precoMax, status);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Veiculo> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<Veiculo> criar(@RequestBody Veiculo veiculo) {
        return ResponseEntity.ok(service.save(veiculo));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Veiculo> atualizar(@PathVariable Long id, @RequestBody Veiculo veiculo) {
        return ResponseEntity.ok(service.update(id, veiculo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
