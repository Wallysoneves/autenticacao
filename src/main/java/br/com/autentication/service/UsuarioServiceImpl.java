package br.com.autentication.service;

import br.com.autentication.domain.Usuario;
import br.com.autentication.domain.dto.UsuarioDTO;
import br.com.autentication.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario buscarUsuario(Long id) {
        return usuarioRepository.findById(id).orElseThrow();
    }

    @Override
    public Usuario criarUsuario(UsuarioDTO usuarioDTO) {

        Usuario usuarioNovo = Usuario.builder()
                .login(usuarioDTO.getLogin())
                .senha(usuarioDTO.getSenha())
                .role(usuarioDTO.getRole())
                .build();

        return usuarioRepository.save(usuarioNovo);
    }
}
