package br.com.oak.aworks.lancamentos.api.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.oak.aworks.lancamentos.api.model.Lancamento;
import br.com.oak.aworks.lancamentos.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
}
