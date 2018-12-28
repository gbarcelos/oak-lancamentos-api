package br.com.oak.aworks.lancamentos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.oak.aworks.lancamentos.api.model.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long> {

}
