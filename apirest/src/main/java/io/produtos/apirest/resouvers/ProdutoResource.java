package io.produtos.apirest.resouvers;

import io.produtos.apirest.models.Produto;
import io.produtos.apirest.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
public class ProdutoResource {

    @Autowired
    ProdutoRepository produtoRepository;

    @PostMapping("/produto")
    public Produto salvaProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

    @GetMapping("/produto")
    public List<Produto> listarProdutos(){
        return produtoRepository.findAll();
    }

    @GetMapping("/produto/{id}")
    public Produto listarProdutoUnico(@PathVariable(value = "id") long id){
        return produtoRepository.findById(id);
    }

    @DeleteMapping("/produto")
    public void deletarProduto(@RequestBody Produto produto){
        produtoRepository.delete(produto);
    }

    @PutMapping("/produto")
    public Produto atualizarProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

}
