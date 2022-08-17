package com.qa.pokedexapi.Controller;

import com.qa.pokedexapi.Models.Pokemon;
import com.qa.pokedexapi.Repo.PokeRepo;

import com.sun.net.httpserver.HttpsParameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PokeController {

    @Autowired
    private PokeRepo pokeRepo;

    @GetMapping(value = "/")
    public String getPage() {
        return "Pokédex";

    }
    @CrossOrigin
    @GetMapping(value = "/pokemon")
    public List<Pokemon> getPokemon() {
        return pokeRepo.findAll();

    }
    @CrossOrigin
    @PostMapping(value = "/save")
    public String savePokemon(@RequestBody Pokemon pokemon) {
        pokeRepo.save(pokemon);
        return "Saved successfully";

    }
    @CrossOrigin
    @PutMapping(value = "/update/{id}")
    public String updatePokemon(@PathVariable int id, @RequestBody Pokemon pokemon) {
        Pokemon updatedPokemon = pokeRepo.findById(id).get();
        updatedPokemon.setName(pokemon.getName());
        updatedPokemon.setType(pokemon.getType());
        updatedPokemon.setRegion(pokemon.getRegion());
        pokeRepo.save(updatedPokemon);
        return "Updated successfully";

    }
    @CrossOrigin
    @DeleteMapping(value = "/delete/{id}")
    public String deletePokemon(@PathVariable int id) {
        Pokemon deletePokemon = pokeRepo.findById(id).get();
        pokeRepo.delete(deletePokemon);
        return "Deleted Pokemon with the ID:" + id;
    }
    @CrossOrigin
    @GetMapping(value = "/getPokemon/{id}")
    public Pokemon getPokemonById(@PathVariable int id) {
        return pokeRepo.findById(id).get();
    }

}