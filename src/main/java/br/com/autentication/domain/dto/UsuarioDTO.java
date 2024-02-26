package br.com.autentication.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class UsuarioDTO {

    private String nome;

    private String sobreNome;
}
