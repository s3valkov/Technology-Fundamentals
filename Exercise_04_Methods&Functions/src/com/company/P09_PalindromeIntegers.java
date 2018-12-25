package com.company;

import java.util.Scanner;

public class P09_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cmd = scanner.nextLine();

        while (!cmd.equals("end")) {
            int number = Integer.parseInt(cmd);
            String chislo = String.format("%d", number);
            System.out.println(chislo.equals(IsPalindrome(number)));
        }

    }

    static String IsPalindrome(int number) {
        int a = 0;
        String abc = null;

        while (number != 0) {
            a = number % 10;
            number /= 10;
            abc = String.format("%d", a);
            number = 0;
        }

        return abc;
    }
}