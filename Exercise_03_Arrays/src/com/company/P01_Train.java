package com.company;

import java.util.Scanner;

public class P01_Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] vagons = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            vagons[i] = people;
            sum += people;
        }

        for (int i = 0; i < vagons.length; i++) {

            if (i == vagons.length - 1) {
                System.out.print(vagons[i]);
            } else {
                System.out.printf("%d ", vagons[i]);
            }
        }

        System.out.printf("\n%d", sum);
    }
}
