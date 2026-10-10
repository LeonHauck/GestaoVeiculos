package com.faculdade.gestaoveiculos.repository;

import com.faculdade.gestaoveiculos.model.Veiculo;
import com.faculdade.gestaoveiculos.model.StatusDisponibilidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long>, JpaSpecificationExecutor<Veiculo> {
}
