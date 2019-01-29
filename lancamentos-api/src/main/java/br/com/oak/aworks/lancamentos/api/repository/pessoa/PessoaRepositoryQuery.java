package br.com.oak.aworks.lancamentos.api.repository.pessoa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.oak.aworks.lancamentos.api.model.Pessoa;
import br.com.oak.aworks.lancamentos.api.repository.filter.PessoaFilter;
import br.com.oak.aworks.lancamentos.api.repository.projection.ResumoPessoa;

public interface PessoaRepositoryQuery {
	
	public Page<Pessoa> filtrar(PessoaFilter pessoaFilter, Pageable pageable);
	
	public Page<ResumoPessoa> resumir(PessoaFilter pessoaFilter, Pageable pageable);

}
