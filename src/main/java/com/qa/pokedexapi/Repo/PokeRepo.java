package com.qa.pokedexapi.Repo;


import com.qa.pokedexapi.Models.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokeRepo extends JpaRepository<Pokemon, Integer> {
}
