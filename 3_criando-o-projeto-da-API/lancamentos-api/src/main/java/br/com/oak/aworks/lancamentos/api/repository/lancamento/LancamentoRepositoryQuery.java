package br.com.oak.aworks.lancamentos.api.repository.lancamento;

import java.util.List;

import br.com.oak.aworks.lancamentos.api.model.Lancamento;
import br.com.oak.aworks.lancamentos.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);
}
