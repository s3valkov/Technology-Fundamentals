package com.company;

import java.util.Scanner;

public class P06_MiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        System.out.println(findMiddleCharacter(word));
    }

    static String findMiddleCharacter(String a) {
        char[] symbol = a.toCharArray();
        char middle = ' ';
        char middle2 = ' ';
        String result = "";

        if (a.length() % 2 == 1) {
            result = Character.toString(symbol[a.length() / 2]);
        } else {
            middle = symbol[a.length() / 2 - 1];
            middle2 = symbol[(a.length() / 2)];
            result = Character.toString(middle) + Character.toString(middle2);

        }

        return result;

    }
}
