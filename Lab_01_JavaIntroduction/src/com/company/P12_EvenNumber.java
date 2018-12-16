package com.company;

import java.util.Scanner;

public class P12_EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;

        while ((!(number % 2 == 0)) && number != 0) {
            number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0) {
                break;
            } else {
                System.out.printf("Please write an even number.\n");
            }

        }
        System.out.println("The number is: " + Math.abs(number));
    }
}
