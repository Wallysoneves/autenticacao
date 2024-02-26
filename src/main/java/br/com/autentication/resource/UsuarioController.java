package br.com.autentication.resource;

import br.com.autentication.domain.Usuario;
import br.com.autentication.domain.dto.UsuarioDTO;
import br.com.autentication.service.UsuarioService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuarios")
@Tags({
        @Tag(name = "usuario", description = "documentação ao resource usuario")
})
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<Usuario> buscarUsuario(@RequestParam("id") Long id) {
        return new ResponseEntity<>(usuarioService.buscarUsuario(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Usuario> criarUsuario(@Valid @RequestBody UsuarioDTO usuarioDTO) {
        return new ResponseEntity<>(usuarioService.criarUsuario(usuarioDTO), HttpStatus.CREATED);
    }
}
