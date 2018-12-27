package com.company;

import java.util.Scanner;

public class P11_BakingRush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine().toLowerCase();
        String[] workDay = line.split("\\|+");

        int n = 0;
        int currentEnergy = 100;
        long currentCoins = 100;

        label:
        while (currentCoins > 0 && n < workDay.length) {

            String[] tokens = workDay[n].split("-+");
            int number = Integer.parseInt(tokens[1]);

            switch (tokens[0]) {
                case "potion":

                    if (currentEnergy + number <= 100) {
                        currentEnergy += number;
                        System.out.printf("You gained %d energy.\n", number);
                    } else {
                        System.out.printf("You gained %d energy.\n", 100 - currentEnergy);
                        currentEnergy = 100;
                    }
                    System.out.printf("Current energy: %d.\n", currentEnergy);
                    break;

                case "chest":

                    if (currentEnergy >= 30) {
                        currentEnergy -= 30;
                        currentCoins += number;
                        System.out.printf("You earned %d coins.\n", number);
                    } else {
                        System.out.println("You had to rest!");
                        currentEnergy += 50;
                    }

                    break;

                default:

                    if (currentCoins - number > 0) {
                        currentCoins -= number;
                        System.out.printf("You bought %s.\n", tokens[0]);
                    } else {
                        System.out.printf("Closed! Cannot afford %s.\n", tokens[0]);
                        break label;
                    }

                    break;
            }

            n++;
        }

        if (n == workDay.length) {
            System.out.println("Day completed!");
            System.out.printf("Coins: %d\n", currentCoins);
            System.out.printf("Energy: %d\n", currentEnergy);
        }


    }

}
