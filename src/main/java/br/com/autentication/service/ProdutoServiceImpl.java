package br.com.autentication.service;

import br.com.autentication.domain.Produto;
import br.com.autentication.domain.dto.ProdutoDTO;
import br.com.autentication.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public Produto buscarProduto(Long id) {
        return produtoRepository.findById(id).orElseThrow();
    }

    @Override
    public Produto criarProduto(ProdutoDTO produtoDTO) {
        Produto produtoNovo = Produto.builder()
                .nome(produtoDTO.getNome())
                .build();

        return produtoRepository.save(produtoNovo);
    }
}
