package com.company;

import java.util.Scanner;

public class P03_CharacterInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.next().charAt(0);
        char end = scanner.next().charAt(0);
        printCharacterInRange(start, end);
    }

    static void printCharacterInRange(char a, char b) {
        System.out.println("");
        int start = 0;
        int end = 0;
        char symbol = ' ';

        if (a < b) {
            start = (int) a;
            end = (int) b;
            symbol = a;
        } else {
            start = (int) b;
            end = (int) a;
            symbol = b;
        }

        for (int i = start; i < end - 1; i++) {
            symbol++;
            System.out.print(symbol + " ");
        }
    }
}

