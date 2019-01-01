package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P03_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isObtaind = false;
        HashMap<String, Integer> keyRegants = new HashMap<>();
        TreeMap<String, Integer> junk = new TreeMap<>();

        keyRegants.put("motes", 0);
        keyRegants.put("fragments", 0);
        keyRegants.put("shards", 0);


        while (!isObtaind) {
            String[] materials = scanner.nextLine().split("\\s+");

            for (int i = 0; i < materials.length - 1; i += 2) {
                int quantity = Integer.parseInt(materials[i]);
                String regant = materials[i + 1].toLowerCase();

                if (regant.equals("motes") || regant.equals("shards")
                        || regant.equals("fragments")) {
                    keyRegants.put(regant, keyRegants.get(regant) + quantity);

                    if (keyRegants.get(regant) >= 250) {
                        keyRegants.put(regant, keyRegants.get(regant) - 250);

                        if (regant.equals("motes")) {
                            System.out.println("Dragonwrath obtained!");
                        } else if (regant.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else {
                            System.out.println("Shadowmourne obtained!");
                        }
                        isObtaind = true;
                        break;
                    }

                } else {

                    if (!junk.containsKey(regant)) {
                        junk.put(regant, quantity);
                    } else {
                        junk.put(regant, junk.get(regant) + quantity);
                    }

                }

            }


        }

        keyRegants.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed().thenComparing(Map.Entry.comparingByKey()))
                .forEach(entry -> {
                    System.out.println(String.format("%s: %d", entry.getKey(), entry.getValue()));
                });

        junk.forEach((k, v) -> {
            System.out.println(String.format("%s: %d", k, v));
        });

    }
}