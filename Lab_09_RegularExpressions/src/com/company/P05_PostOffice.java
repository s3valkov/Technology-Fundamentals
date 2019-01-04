package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P05_PostOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|");
        String firstPart = input[0];
        //String secondPart = input[1];
        //String thirdPart = input[2];

        Pattern pattern = Pattern.compile("([#$%\\*&]){1}[A-Z]+\\1");
        Matcher matcher = pattern.matcher(firstPart);

        if (matcher.find()) {
            System.out.println(matcher.group());
        }


    }
}
