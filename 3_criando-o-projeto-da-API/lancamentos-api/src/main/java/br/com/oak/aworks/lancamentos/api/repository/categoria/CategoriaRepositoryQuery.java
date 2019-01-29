package br.com.oak.aworks.lancamentos.api.repository.categoria;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.oak.aworks.lancamentos.api.model.Categoria;
import br.com.oak.aworks.lancamentos.api.repository.filter.CategoriaFilter;

public interface CategoriaRepositoryQuery {
	
	public Page<Categoria> filtrar(CategoriaFilter categoriaFilter, Pageable pageable);

}
