package br.com.farmacia.api.controllers;

import br.com.farmacia.api.dtos.DadosCadastroFabricante;
import br.com.farmacia.api.entities.Fabricante;
import br.com.farmacia.api.repositories.FabricanteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fabricantes")
public class FabricanteController {

    @Autowired
    private FabricanteRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroFabricante dados){
        var fabricante = repository.save(new Fabricante(dados));
        return ResponseEntity.ok(fabricante);
//        System.out.println(dados);
    }
}
