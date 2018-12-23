package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] number = scanner.nextLine().split(" ");
        int[] numbers = new int[number.length];


        if (numbers.length == 1) {
            System.out.println(0);
            return;
        }

        int sum1 = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (i > 0) {
                sum1 += numbers[i - 1];
            }

            int sum2 = 0;

            for (int j = i + 1; j < numbers.length; j++) {
                sum2 += numbers[j];
            }

            if (sum1 == sum2) {
                System.out.println(numbers[i]);
                return;
            }
        }

        System.out.println("no");
    }
}



