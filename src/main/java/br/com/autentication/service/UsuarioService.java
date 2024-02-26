package br.com.autentication.service;

import br.com.autentication.domain.Usuario;
import br.com.autentication.domain.dto.UsuarioDTO;

public interface UsuarioService {

    Usuario buscarUsuario(Long id);

    Usuario criarUsuario(UsuarioDTO usuarioDTO);
}
