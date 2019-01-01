package com.company;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class P01_CountsChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().replaceAll("\\s+", "");
        LinkedHashMap<Character, Integer> charByCount = new LinkedHashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);

            if (!(charByCount.containsKey(letter))) {
                charByCount.put(letter, 1);
            } else {
                charByCount.put(letter, charByCount.get(letter) + 1);
            }

        }

        for (Character symbol : charByCount.keySet()) {
            System.out.println(String.format("%c -> %d", symbol, charByCount.get(symbol)));
        }
    }
}
