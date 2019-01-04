package com.company;

import java.util.Scanner;

public class P01_TextRepeater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] words = scanner.nextLine().split("\\s+");
        String result = "";

        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < words[i].length(); j++) {
                result = result.concat(words[i]);
            }

        }

        System.out.println(result);
    }
}
