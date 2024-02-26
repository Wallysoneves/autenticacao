package br.com.autentication.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class UsuarioDTO {

    private String login;

    private String senha;

    private String role;
}
