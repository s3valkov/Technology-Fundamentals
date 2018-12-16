package com.company;

import java.util.Scanner;

public class p11_MultiplicationTable2_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int lastNumber = Integer.parseInt(scanner.nextLine());

        do {
            System.out.println(number + " X " + lastNumber + " = " + lastNumber * number);
            lastNumber++;
        } while (lastNumber <= 10);
    }
}
