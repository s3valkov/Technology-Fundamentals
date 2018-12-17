package com.company;

import java.util.Scanner;

public class P03_Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine().toLowerCase();
        String day = scanner.nextLine().toLowerCase();

        double price;
        double sum;

        switch (group) {
            case "students":

                if (day.equals("friday")) {
                    price = 8.45;
                } else if (day.equals("saturday")) {
                    price = 9.80;
                } else {
                    price = 10.46;
                }

                if (people >= 30) {
                    sum = (price * people) * 0.85;
                } else {
                    sum = price * people;
                }

                break;
            case "business":

                if (day.equals("friday")) {
                    price = 10.90;
                } else if (day.equals("saturday")) {
                    price = 15.60;
                } else {
                    price = 16;
                }

                if (people >= 100) {
                    sum = (people - 10) * price;
                } else {
                    sum = price * people;
                }
                break;
            default:

                if (day.equals("friday")) {
                    price = 15;
                } else if (day.equals("saturday")) {
                    price = 20;
                } else {
                    price = 22.50;
                }

                if (people >= 10 && people <= 20) {
                    sum = (people * price) * 0.95;
                } else {
                    sum = price * people;
                }
                break;
        }

        System.out.printf("Total price: %.02f", sum);
    }
}
