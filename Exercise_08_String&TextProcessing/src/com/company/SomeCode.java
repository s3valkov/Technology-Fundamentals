package com.company;

import java.util.Scanner;

public class SomeCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        text = text.replaceAll("[d-zD-Z#\\|{}]*", "");
        System.out.println(text.trim());
    }
}
