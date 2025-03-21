package com.udemy.spring_boot.model.repositories;

import com.udemy.spring_boot.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
}
