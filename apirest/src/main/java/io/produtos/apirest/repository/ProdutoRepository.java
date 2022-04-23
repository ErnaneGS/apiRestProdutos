package io.produtos.apirest.repository;

import io.produtos.apirest.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Produto findById(long id);

}
