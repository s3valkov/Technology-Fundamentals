package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P02_DungeostDark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int healt = 100;
        long coins = 0;
        long count = 0;

        ArrayList<String> rooms = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\|+")));

        label:
        for (int i = 0; i < rooms.size(); i++) {
            String[] tokens = rooms.get(i).split("\\s+");
            long number = Math.abs(Integer.parseInt(tokens[1]));

            if (tokens[0].equals("potion")) {

                if (healt + number < 100) {
                    healt += number;
                    System.out.printf("You healed for %d hp.\n", number);

                } else if (healt + number > 100) {
                    System.out.printf("You healed for %d hp.\n", 100 - healt);
                    healt = 100;
                } else {
                    healt = 100;
                    System.out.printf("You healed for 0 hp.\n");
                }

                System.out.printf("Current health: %d hp.\n", healt);
            } else if (tokens[0].equals("chest")) {
                coins += number;
                System.out.printf("You found %d coins.\n", number);
            } else {

                if (healt - number > 0) {
                    healt -= number;
                    System.out.printf("You slayed %s.\n", tokens[0]);
                } else {
                    System.out.printf("You died! Killed by %s.\n", tokens[0]);
                    System.out.printf("Best room: %d\n", count + 1);
                    break label;
                }

            }
            count++;
        }

        if (count > rooms.size() - 1) {
            System.out.printf("You've made it!\n");
            System.out.printf("Coins: %d\n", coins);
            System.out.printf("Health: %d\n", healt);
        }

    }
}
