package br.com.oak.aworks.lancamentos.api.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.oak.aworks.lancamentos.api.model.Lancamento;
import br.com.oak.aworks.lancamentos.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

	List<Lancamento> findByDataVencimentoLessThanEqualAndDataPagamentoIsNull(LocalDate data);
}