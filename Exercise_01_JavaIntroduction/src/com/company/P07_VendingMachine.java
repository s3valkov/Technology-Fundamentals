package com.company;

import java.util.Scanner;

public class P07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;

        while (true) {

            String text = scanner.nextLine().toLowerCase();

            if (text.equals("start")) {
                break;
            }

            double coin = Double.parseDouble(text);

            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                sum += coin;
            } else {
                System.out.printf("Cannot accept %.2f\n", coin);
            }
        }

        while (true) {
            String product = scanner.nextLine().toLowerCase();

            if (product.equals("nuts")) {

                if (sum >= 2) {
                    sum -= 2;
                    System.out.println("Purchased Nuts");
                } else {
                    System.out.println("Sorry, not enough money");
                    continue;
                }

            } else if (product.equals("water")) {

                if (sum >= 0.7) {
                    sum -= 0.7;
                    System.out.println("Purchased Water");
                } else {
                    System.out.println("Sorry, not enough money");
                    continue;
                }

            } else if (product.equals("crisps")) {

                if (sum >= 1.5) {
                    sum -= 1.5;
                    System.out.println("Purchased Crisps");
                } else {
                    System.out.println("Sorry, not enough money");
                    continue;
                }

            } else if (product.equals("soda")) {

                if (sum >= 0.8) {
                    sum -= 0.8;
                    System.out.println("Purchased Soda");
                } else {
                    System.out.println("Sorry, not enough money");
                    continue;
                }

            } else if (product.equals("coke")) {

                if (sum >= 1) {
                    sum -= 1;
                    System.out.println("Purchased Coke");
                } else {
                    System.out.println("Sorry, not enough money");
                    continue;
                }

            } else if (product.equals("end")) {
                break;
            } else {
                System.out.println("Invalid product");
            }
        }

        System.out.printf("Change: %.2f ", sum);
    }

}