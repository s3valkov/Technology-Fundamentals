package com.company;

import java.util.Scanner;

public class P02_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String removedPart = scanner.nextLine();
        String input = scanner.nextLine();

        while (input.contains(removedPart) == true && !removedPart.isEmpty()) {
            input = input.replace(removedPart, "");
        }

        System.out.println(input);

    }
}
