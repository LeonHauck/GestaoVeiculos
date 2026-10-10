package com.faculdade.gestaoveiculos.repository;

import com.faculdade.gestaoveiculos.model.Veiculo;
import com.faculdade.gestaoveiculos.model.StatusDisponibilidade;
import org.springframework.data.jpa.domain.Specification;
import jakarta.persistence.criteria.Predicate;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VeiculoSpecification {
    
    public static Specification<Veiculo> filterBy(Long marcaId, Long modeloId, Integer ano, BigDecimal precoMax, StatusDisponibilidade status) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            
            if (marcaId != null) {
                predicates.add(criteriaBuilder.equal(root.get("modelo").get("marca").get("id"), marcaId));
            }
            if (modeloId != null) {
                predicates.add(criteriaBuilder.equal(root.get("modelo").get("id"), modeloId));
            }
            if (ano != null) {
                predicates.add(criteriaBuilder.equal(root.get("anoFabricacao"), ano));
            }
            if (precoMax != null) {
                predicates.add(criteriaBuilder.lessThanOrEqualTo(root.get("preco"), precoMax));
            }
            if (status != null) {
                predicates.add(criteriaBuilder.equal(root.get("status"), status));
            }
            
            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
}
