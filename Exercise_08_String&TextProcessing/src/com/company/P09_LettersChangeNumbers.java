package com.company;

import java.util.Scanner;

public class P09_LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        double resultAll = 0;

        for (String word : words) {
            char firstLetter = word.charAt(0);
            char lastLetter = word.charAt(word.length() - 1);
            double number = Double.parseDouble(word.replaceAll("[A-Za-z]", ""));

            if (Character.isLowerCase(firstLetter)) {
                number = number * (firstLetter + 1 - 'a');
            } else if (Character.isUpperCase(firstLetter)) {
                number = number / (firstLetter + 1 - 'A');
            }

            if (Character.isUpperCase((lastLetter))) {
                number = number - (lastLetter + 1 - 'A');
            } else if (Character.isLowerCase(lastLetter)) {
                number = number + (lastLetter + 1 - 'a');
            }

            resultAll += number;
        }
        System.out.printf("%.2f", resultAll);


    }
}
