package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04_MatchNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split("\\s+");

        Pattern pattern = Pattern.compile("^(-?\\d{1,}\\.?\\d*)$");

        for (String number : text) {
            Matcher matcher = pattern.matcher(number.trim());

            if (matcher.find()) {
                System.out.print(number + " ");
            }

        }


    }
}
