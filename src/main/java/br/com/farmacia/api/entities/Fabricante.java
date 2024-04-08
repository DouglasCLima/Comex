package br.com.farmacia.api.entities;

import br.com.farmacia.api.dtos.DadosCadastroFabricante;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="fabricantes")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Fabricante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public Fabricante(DadosCadastroFabricante dados) {
        this.nome = dados.nome();
    }

    public Fabricante(Fabricante dados) {
        this.id = dados.getId();
    }

    public void atualizarInformacoes(Fabricante dados) {
        if(dados.getNome() != null){
            this.nome = dados.getNome();
        }
    }

}
