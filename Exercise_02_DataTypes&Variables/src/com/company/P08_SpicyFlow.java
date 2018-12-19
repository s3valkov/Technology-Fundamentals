package com.company;

import java.util.Scanner;

public class P08_SpicyFlow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int spice = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int days = 0;

        for (int i = spice; i >= 100; i -= 10) {
            sum += spice - 26;
            spice = spice - 10;
            days++;
        }

        System.out.println(days);

        if (sum >= 26) {
            System.out.println(sum - 26);
        } else {
            System.out.println(sum);
        }
    }
}
