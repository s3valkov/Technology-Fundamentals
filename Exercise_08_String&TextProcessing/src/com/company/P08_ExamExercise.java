package com.company;

import java.util.Scanner;

public class P08_ExamExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");
        double sum = 0;
        for (String word : words) {
            char firstLetter = word.charAt(0);
            String num = "";
            int counter = 1;

            while (Character.isDigit(word.charAt(counter))) {
                num += word.charAt(counter);
                counter++;
            }

            char secondLetter = word.charAt(counter);
            long number = Integer.parseInt(num);

            if (Character.isLowerCase(firstLetter)) {
                sum += number * (firstLetter + 1 - 'a');
            } else if (Character.isUpperCase(firstLetter)) {
                sum += (double) number / (double) (firstLetter + 1 - 'A');
            }

            if (Character.isLowerCase(secondLetter)) {
                sum = sum + (secondLetter + 1 - 'a');
            } else if (Character.isUpperCase(secondLetter)) {
                sum = sum - (secondLetter + 1 - 'A');
            }


        }

        System.out.printf("%.2f", sum);
    }
}
