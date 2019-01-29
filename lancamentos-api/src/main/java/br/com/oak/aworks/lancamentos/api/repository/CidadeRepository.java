package br.com.oak.aworks.lancamentos.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.oak.aworks.lancamentos.api.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
	
	List<Cidade> findByEstadoCodigo(Long estadoCodigo);

}
