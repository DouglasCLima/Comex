package br.com.farmacia.api.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroFabricante(
        @NotBlank
        String nome) {
}
