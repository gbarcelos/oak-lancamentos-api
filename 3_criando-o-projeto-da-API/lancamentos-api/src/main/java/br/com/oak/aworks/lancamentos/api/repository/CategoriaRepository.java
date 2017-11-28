package br.com.oak.aworks.lancamentos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.oak.aworks.lancamentos.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
