package com.company;

import java.util.Scanner;

public class P09_Poke_Mon {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int originialPower = power;
        int count = 0;

        while (power >= distance) {
            power -= distance;
            count++;

            if (power * 2 == originialPower && exhaustionFactor != 0) {
                power /= exhaustionFactor;
            }
        }

        System.out.printf("%d\n%d", power, count);
    }
}

