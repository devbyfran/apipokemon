package com.apipokemon.apipokemon.service;

import com.apipokemon.apipokemon.dto.PokemonDTO;
import com.apipokemon.apipokemon.model.Pokemon;
import com.apipokemon.apipokemon.repository.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PokemonService {

    private final PokemonRepository repository;

    public PokemonService(PokemonRepository pokemonRepository) {
        this.repository = pokemonRepository;
    }

    public List<PokemonDTO> getAll() {
        return repository.findAll()
                .stream()
                .map( p-> new PokemonDTO(p.getNombre(), p.getTipo()))
                .collect(Collectors.toList());
    }

    public PokemonDTO getById(Long id) {
        return repository.findById(id)
                .map(p-> new PokemonDTO(p.getNombre(), p.getTipo()))
                .orElse(null);
    }

    public PokemonDTO save(Pokemon pokemon) {
        Pokemon saved = repository.save(pokemon);
        return new PokemonDTO(saved.getNombre(), saved.getTipo());
    }
}
