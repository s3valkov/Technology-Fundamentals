package com.company;

import java.util.Scanner;

public class P07_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        String result = repeatString(word, n);

        System.out.println(result);
    }

    static String repeatString(String x, int n) {
        String abc = "";

        for (int i = 0; i < n; i++) {
            abc += x;
        }

        return abc;
    }
}
