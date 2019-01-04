package com.company;

import java.util.Scanner;

public class P07_StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            if (symbol == '>') {
                result += symbol;
                i++;
                int power = text.charAt(i) - '0';
                power--;

                while (power > 0 && text.length() - 1 > i) {
                    i++;
                    symbol = text.charAt(i);

                    if (symbol == '>') {
                        result += symbol;
                        i++;
                        power += text.charAt(i) - '0';
                        power--;
                        continue;
                    }

                    power--;
                }


            } else {
                result += symbol;
            }
        }

        System.out.println(result);


    }
}
