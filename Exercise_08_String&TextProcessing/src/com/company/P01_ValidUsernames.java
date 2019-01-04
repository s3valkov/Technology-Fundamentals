package com.company;

import java.util.Scanner;

public class P01_ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(", ");

        for (String word : words) {

            if (word.length() > 2 && word.length() <= 16) {

                for (int i = 0; i < word.length(); i++) {
                    char symbol = word.charAt(i);

                    if (Character.isLetterOrDigit(symbol)
                            || symbol == '-'
                            || symbol == '_') {

                        if (i == word.length() - 1) {
                            System.out.println(word);
                        }

                    } else {
                        break;
                    }
                }
            }

        }
    }
}
