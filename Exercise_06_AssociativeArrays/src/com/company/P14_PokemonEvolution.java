package com.company;

import java.util.*;

public class P14_PokemonEvolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, ArrayList<String>> pokemons = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("wubbalubbadubdub")) {
                break;
            }

            String pokemon = "";
            String evolution = "";
            int power = 0;


            if (input.contains("->")) {
                String[] pokemonInfo = input.split(" -> ");
                pokemon = pokemonInfo[0];
                evolution = pokemonInfo[1];
                power = Integer.parseInt(pokemonInfo[2]);
            } else {
                pokemon = input;

                if (pokemons.containsKey(pokemon)) {
                    System.out.println("# " + pokemon);
                    System.out.println(String.join("\n", pokemons.get(pokemon)));
                }

                continue;
            }

            if (!pokemons.containsKey(pokemon) && input.contains("->")) {
                pokemons.put(pokemon, new ArrayList<>());
            }

            pokemons.get(pokemon).add(evolution + " <-> " + power);

        }

        pokemons.entrySet().stream().forEach(e -> {
            System.out.println("# " + e.getKey());

            e.getValue().sort((o1, o2) ->
                    Integer.compare(Integer.parseInt(o2.split(" <-> ")[1]), Integer.parseInt(o1.split(" <-> ")[1])));
            e.getValue().forEach(System.out::println);

        });


    }
}

