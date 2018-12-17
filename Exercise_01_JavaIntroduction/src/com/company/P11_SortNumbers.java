package com.company;

import java.util.Scanner;

public class P11_SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        if (a > b && a > c) {
            System.out.println(a);
            System.out.println(Math.max(b, c));
            System.out.println(Math.min(b, c));
        } else if (a > b && a < c) {
            System.out.println(c);
            System.out.println(Math.max(a, b));
            System.out.println(Math.min(b, a));
        } else if (b > c) {
            System.out.println(b);
            System.out.println(Math.max(a, c));
            System.out.println(Math.min(a, c));
        } else {
            System.out.println(c);
            System.out.println(Math.max(b, a));
            System.out.println(Math.min(b, a));
        }

    }
}
