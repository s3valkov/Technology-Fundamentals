package com.company;

import java.util.Scanner;

public class P01_IntegerOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());

        long result = ((a + b) * c) / d;
        System.out.println(result);
    }
}
