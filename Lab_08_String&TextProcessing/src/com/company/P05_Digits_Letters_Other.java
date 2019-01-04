package com.company;

import java.util.Scanner;

public class P05_Digits_Letters_Other {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String letters = "";
        String digits = "";
        String others = "";

        for (int i = 0; i < word.length(); i++) {
            char index = word.charAt(i);

            if (Character.isDigit(index)) {
                digits += index;
            } else if (Character.isLetter(index)) {
                letters += index;
            } else {
                others += index;
            }

        }

        System.out.printf("%s\n%s\n%s", digits, letters, others);
        
    }
}
