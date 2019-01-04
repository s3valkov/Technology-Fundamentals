package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P10_Deciphering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] info = scanner.nextLine().split("\\s+");


        String word = "";
        if (input.matches("[d-zD-Z#\\|{}]*")) {

            for (char symbol : input.toCharArray()) {
                int value = symbol - 3;
                word += (char) value;
            }

            word.replaceAll(info[0], info[1]);
        } else {
            System.out.println("This is not the book you are looking for.");
        }

        String result = word.replaceAll(info[0], info[1]);
        System.out.println(result);
    }
}
