package br.com.autentication.resource;

import br.com.autentication.domain.Produto;
import br.com.autentication.domain.dto.ProdutoDTO;
import br.com.autentication.service.ProdutoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("produtos")
@Tags({@Tag(name = "produto", description = "documentação ao resource produto")})
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<Produto> buscarUsuario(@RequestParam("id") Long id) {
        return new ResponseEntity<>(produtoService.buscarProduto(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Produto> criarUsuario(@Valid @RequestBody ProdutoDTO produto) {
        return new ResponseEntity<>(produtoService.criarProduto(produto), HttpStatus.CREATED);
    }
}
