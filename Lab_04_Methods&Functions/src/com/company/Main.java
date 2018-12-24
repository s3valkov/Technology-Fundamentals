package com.company;

import java.util.Scanner;

public class Main {
    static void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.printf("%d\n", i);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        printNumbers(start, end);
    }
}
