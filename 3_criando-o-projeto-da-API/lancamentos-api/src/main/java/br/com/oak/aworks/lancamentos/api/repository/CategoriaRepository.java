package br.com.oak.aworks.lancamentos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.oak.aworks.lancamentos.api.model.Categoria;
import br.com.oak.aworks.lancamentos.api.repository.categoria.CategoriaRepositoryQuery;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>, CategoriaRepositoryQuery  {

}
