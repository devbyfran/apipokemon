package com.apipokemon.apipokemon.controller;

import com.apipokemon.apipokemon.dto.PokemonDTO;
import com.apipokemon.apipokemon.model.Pokemon;
import com.apipokemon.apipokemon.service.PokemonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    private final PokemonService service;

    public PokemonController(PokemonService service) {
        this.service = service;
    }

    @GetMapping
    public List<PokemonDTO> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PokemonDTO> getById(@PathVariable Long id) {
        PokemonDTO dto = service.getById(id);
        return dto != null ? ResponseEntity.ok(dto) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public PokemonDTO create(@RequestBody Pokemon pokemon) {
        return service.save(pokemon);
    }
}
