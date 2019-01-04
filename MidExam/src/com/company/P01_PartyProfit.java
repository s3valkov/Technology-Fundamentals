package com.company;

import java.util.Scanner;

public class P01_PartyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int partySize = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= days; i++) {

            if (i % 10 == 0) {
                partySize -= 2;
            }

            if (i % 15 == 0) {
                partySize += 5;
            }

            if (i % 3 == 0) {
                sum -= 3 * partySize;
            }

            if (i % 5 == 0 && i % 3 == 0) {
                sum += partySize * 20;
                sum -= 2 * partySize;
            } else if (i % 5 == 0) {
                sum += partySize * 20;
            }

            sum += 50 - (partySize * 2);

        }

        double result = sum / partySize;
        System.out.printf("%d companions received %.0f coins each."
                , partySize
                , Math.floor(result));
    }
}
