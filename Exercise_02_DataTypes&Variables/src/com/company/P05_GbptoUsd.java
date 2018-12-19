package com.company;

import java.util.Scanner;

public class P05_GbptoUsd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double gbp = Double.parseDouble(scanner.nextLine());
        double usd = gbp * 1.31;

        System.out.printf("%.3f", usd);
    }
}
