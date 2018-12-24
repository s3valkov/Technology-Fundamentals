package com.company;

import java.util.Scanner;

public class P03_PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        printTriangle(number);
    }

    static void printLine(int start, int end) {

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    static void printTriangle(int n) {

        for (int line = 1; line <= n; line++) {
            printLine(1, line);
        }

        for (int line = n - 1; line >= 1; line--) {
            printLine(1, line);
        }

    }
}
