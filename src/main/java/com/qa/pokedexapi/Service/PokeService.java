package com.qa.pokedexapi.Service;

import com.qa.pokedexapi.Repo.PokeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokeService {
    @Autowired
    public PokeRepo repo;

    @Autowired
    public PokeService(PokeRepo repo) {this.repo = repo;}
}
