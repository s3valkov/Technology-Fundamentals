package com.company;

import java.util.Scanner;

public class P05_AddAndSubstract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        System.out.println(calculateThreeIntegers(a, b, c));
    }

    static int calculateThreeIntegers(int a, int b, int c){
        int result = (a + b) - c;
        return result;
    }
}
