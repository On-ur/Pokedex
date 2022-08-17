package com.qa.pokedexapi;



import com.qa.pokedexapi.Models.Pokemon;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.BeforeAll;
import nl.jqno.equalsverifier.EqualsVerifier;


@SpringBootTest
class PokedexApiApplicationTests {

    @Test
    void contextLoads() {
    }

    @BeforeAll
    public static void addPokemon() {
        testPokemon = new Pokemon("1", "Bulbasaur", "Grass", "Kanto");

    }

    @Test
    public void testEquals() {
        EqualsVerifier.simple().forClass(Pokemon.class).verify();
    }

}
