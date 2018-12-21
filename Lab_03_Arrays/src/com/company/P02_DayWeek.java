package com.company;

import java.util.Scanner;

public class P02_DayWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());
        String[] x = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (day >= 1 && day <= 7) {
            System.out.println(x[day - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}


