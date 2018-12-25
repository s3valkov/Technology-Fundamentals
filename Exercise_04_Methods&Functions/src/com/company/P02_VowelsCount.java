package com.company;

import java.util.Scanner;

public class P02_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase();
        int count = 0;
        System.out.println(countVowels(count, word));
    }

    static int countVowels(int a, String word) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char symbol = word.charAt(i);

            if (symbol == 'a' || symbol == 'e' || symbol == 'u' || symbol == 'o' || symbol == 'i') {
                count++;
            }

        }

        return count;
    }
}
