package br.com.farmacia.api.dtos;

import br.com.farmacia.api.entities.Fabricante;
import jakarta.validation.constraints.NotBlank;

public record DadosCadastroProduto(
        @NotBlank
        Long id,
        @NotBlank
        String nome,
        @NotBlank
        String descricao,
        @NotBlank
        Double preco,
        @NotBlank
        Fabricante fabricante
        ) {
}
