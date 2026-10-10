package com.faculdade.gestaoveiculos.service;

import com.faculdade.gestaoveiculos.model.Veiculo;
import com.faculdade.gestaoveiculos.model.StatusDisponibilidade;
import com.faculdade.gestaoveiculos.repository.VeiculoRepository;
import com.faculdade.gestaoveiculos.repository.VeiculoSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.List;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository repository;

    public List<Veiculo> findAll(Long marcaId, Long modeloId, Integer ano, BigDecimal precoMax, StatusDisponibilidade status) {
        return repository.findAll(VeiculoSpecification.filterBy(marcaId, modeloId, ano, precoMax, status));
    }

    public Veiculo findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Veículo não encontrado"));
    }

    public Veiculo save(Veiculo veiculo) {
        return repository.save(veiculo);
    }

    public Veiculo update(Long id, Veiculo veiculoAtualizado) {
        Veiculo veiculo = findById(id);
        veiculo.setPreco(veiculoAtualizado.getPreco());
        veiculo.setQuilometragem(veiculoAtualizado.getQuilometragem());
        veiculo.setStatus(veiculoAtualizado.getStatus());
        // Atualizando os demais campos se necessário
        if(veiculoAtualizado.getCor() != null) veiculo.setCor(veiculoAtualizado.getCor());
        if(veiculoAtualizado.getAnoFabricacao() != null) veiculo.setAnoFabricacao(veiculoAtualizado.getAnoFabricacao());
        if(veiculoAtualizado.getModelo() != null) veiculo.setModelo(veiculoAtualizado.getModelo());
        
        return repository.save(veiculo);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
