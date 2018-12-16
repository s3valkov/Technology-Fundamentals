package com.company;

import java.util.Scanner;

public class P04_Backin30Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int minafter = minutes + 30;

        if (minafter >= 60) {
            hour += 1;
            minutes = minafter - 60;
        } else {
            minutes += 30;
        }

        if (hour > 23) {
            hour = 0;
        }

        if (minutes < 10) {
            System.out.printf("%d:0%d", hour, minutes);

        } else {
            System.out.printf("%d:%d", hour, minutes);
        }

    }

}
