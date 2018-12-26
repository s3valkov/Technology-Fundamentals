package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double flourPrice = Double.parseDouble(scanner.nextLine());
        double eggPrice = Double.parseDouble(scanner.nextLine());
        double apronPrice = Double.parseDouble(scanner.nextLine());

        flourPrice = flourPrice * (students - (students / 5));
        eggPrice *= 10 * students;
        apronPrice *= Math.ceil(students * 1.2);

        double sum = flourPrice + eggPrice + apronPrice;

        if (sum <= budget) {
            System.out.printf("Items purchased for %.2f$.", sum);
        } else {
            System.out.printf("%.2f$ more needed.", Math.abs(budget - sum));
        }

    }
}
