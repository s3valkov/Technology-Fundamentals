package com.company;

import java.util.Scanner;

public class P01_MoneyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] money = {10.5, 20.2, 123.2, 45.60, 127, 33.33};
        int startPosition = Integer.parseInt(scanner.nextLine());

        double sum = money[startPosition];
        String move = scanner.nextLine().toLowerCase();

        while (!move.equals("end")) {

            if (move.equals("left")) {

                if (startPosition <= 0) {
                    System.out.println("Please move right");
                } else {
                    startPosition--;
                    sum += startPosition;
                }

            } else if (move.equals("right")) {

                if (startPosition >= money.length - 1) {
                    System.out.println("Please move left");
                } else {
                    startPosition++;
                    sum += startPosition;
                }

            } else {
                System.out.println("Invalid command!");
            }

            move = scanner.nextLine().toLowerCase();
        }

        System.out.printf("%.2f", sum);
    }
}
