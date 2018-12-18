package com.company;

import java.util.Scanner;

public class p05_SpecialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = 0;
            int y = i;

            while (y != 0) {
                sum += y % 10;
                y /= 10;
            }

            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> true\n", i);
            } else {
                System.out.printf("%d -> false\n", i);
            }
        }
    }
}
