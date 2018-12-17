package com.company;

import java.util.Scanner;

public class P08_TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= number; i++) {

            for (int j = 1; j <= i; j++) {

                if (j == i) {
                    System.out.print(i);
                } else {
                    System.out.print(i + " ");
                }
            }

            if (i != 0) {
                System.out.println();
            }
        }
    }
}
