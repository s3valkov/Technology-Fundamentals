package com.company;

import java.util.Scanner;

public class P10_RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int games = Integer.parseInt(scanner.nextLine());
        double headset = Double.parseDouble(scanner.nextLine());
        double mouse = Double.parseDouble(scanner.nextLine());
        double keyboard = Double.parseDouble(scanner.nextLine());
        double display = Double.parseDouble(scanner.nextLine());

        int headsetCount = 0;
        int mouseCount = 0;
        int keyboardCount = 0;
        int displayCount = 0;
        double price = 0;

        for (int i = 1; i <= games; i++) {

            if (i % 2 == 0 && i % 3 == 0) {
                keyboardCount++;
                headsetCount++;
                mouseCount++;

                if (keyboardCount > 0 && keyboardCount % 2 == 0) {
                    displayCount++;
                }

            } else if (i % 2 == 0) {
                headsetCount++;
            } else if (i % 3 == 0) {
                mouseCount++;
            }
        }

        price = mouse * mouseCount + headsetCount * headset + keyboardCount * keyboard + display * displayCount;
        System.out.printf("Rage expenses: %.2f lv.", price);
    }
}
