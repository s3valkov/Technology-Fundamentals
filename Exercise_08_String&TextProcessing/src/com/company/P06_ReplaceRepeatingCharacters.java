package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06_ReplaceRepeatingCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        List<Character> characters = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (!characters.contains(c)) {
                characters.add(c);
            }

            if (characters.contains(c) && !characters.get(characters.size() - 1).equals(c) && i >= 1) {
                characters.add(c);
            }

        }

        for (Character character : characters) {
            System.out.print(character);
        }
    }
}
