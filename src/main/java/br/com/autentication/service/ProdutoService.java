package br.com.autentication.service;

import br.com.autentication.domain.Produto;
import br.com.autentication.domain.dto.ProdutoDTO;

public interface ProdutoService {

    Produto buscarProduto(Long id);
    Produto criarProduto(ProdutoDTO produtoDTO);
}
