package com.company;

import java.util.Scanner;

public class P04_CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        for (char symbol : text.toCharArray()) {
            int value = symbol + 3;
            sb.append((char) value);
        }

        System.out.println(sb);
    }
}
