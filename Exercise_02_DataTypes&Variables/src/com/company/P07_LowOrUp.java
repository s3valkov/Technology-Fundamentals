package com.company;

import java.util.Scanner;

public class P07_LowOrUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.nextLine().charAt(0);

        if (Character.isUpperCase(a) == true) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }

    }
}
