package com.company;

import java.util.Scanner;

public class P02_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        String firstWord = words[0];
        String secondWord = words[1];

        int sum = 0;
        int min = Math.min(firstWord.length(), secondWord.length());

        for (int i = 0; i < min; i++) {
            sum += firstWord.charAt(i) * secondWord.charAt(i);
        }

        if (firstWord.length() > secondWord.length()) {

            for (int i = min; i < firstWord.length(); i++) {
                sum += firstWord.charAt(i);
            }

        } else if (firstWord.length() < secondWord.length()) {

            for (int i = min; i < secondWord.length(); i++) {
                sum += secondWord.charAt(i);
            }

        }

        System.out.println(sum);

    }
}
