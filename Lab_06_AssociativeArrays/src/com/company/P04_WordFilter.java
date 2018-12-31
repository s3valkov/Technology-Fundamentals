package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class P04_WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = Arrays
                .stream(scanner.nextLine().split(" "))
                .filter(w -> w.length() % 2 == 0).filter(w-> w.length() % 3 == 1)
                .toArray(String[]::new);

        for (String word : words) {
            System.out.println(word);
        }


    }
}
