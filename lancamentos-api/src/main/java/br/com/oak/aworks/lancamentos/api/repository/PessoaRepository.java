package br.com.oak.aworks.lancamentos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.oak.aworks.lancamentos.api.model.Pessoa;
import br.com.oak.aworks.lancamentos.api.repository.pessoa.PessoaRepositoryQuery;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>, PessoaRepositoryQuery {

}
