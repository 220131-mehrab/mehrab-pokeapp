package com.github.MehrabRahman.pokedex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pokedex {
    Pokemon[] pokemans = new Pokemon[1045];

    public Pokedex(String filename) {
        File file = new File(filename);
        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("\n");
            scanner.next();
            int i = 0;
            while (scanner.hasNext()) {
                Pokemon newPokemon = new Pokemon();
                String[] columns = scanner.next().split(",");
                newPokemon.setID(columns[0]);
                newPokemon.setName(columns[2]);
                newPokemon.setNumber(columns[1]);
                pokemans[i] = newPokemon;
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
