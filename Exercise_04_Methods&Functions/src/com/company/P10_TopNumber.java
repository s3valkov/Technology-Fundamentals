package com.company;

import java.util.Scanner;

public class P10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        topNumber(number);
    }

    static void topNumber(int number) {

        for (int i = 1; i <= number; i++) {
            int num = i;
            int sum = 0;
            int count = 0;

            while (num != 0) {
                int x = num % 10;
                sum += x;

                if (x % 2 == 1) {
                    count++;
                }

                num /= 10;
            }

            if (count != 0 && sum % 8 == 0) {
                System.out.println(i);
            }

        }


    }
}
