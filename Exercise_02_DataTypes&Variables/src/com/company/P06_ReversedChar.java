package com.company;

import java.util.Scanner;

public class P06_ReversedChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            char a = scanner.next().charAt(0);
            sb.append(a);
        }

        System.out.println(sb.reverse());

    }
}
