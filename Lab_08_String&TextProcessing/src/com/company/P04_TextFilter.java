package com.company;

import java.util.Scanner;

public class P04_TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");

        String text = scanner.nextLine();
        for (int i = 0; i < bannedWords.length; i++) {
            text = text.replaceAll(bannedWords[i], wordToAsterix(bannedWords[i]));
        }
        System.out.println(text);

    }


    static String wordToAsterix(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result = result.concat("*");
        }

        return result;
    }
}
