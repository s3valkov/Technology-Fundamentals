package com.company;

import java.util.Scanner;

public class P09_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cmd = scanner.nextLine().toLowerCase();

        switch (cmd) {
            case "int":
                int a = Integer.parseInt(scanner.nextLine());
                int b = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(a, b));
                break;
            case "char":
                char c = scanner.next().charAt(0);
                char d = scanner.next().charAt(0);
                System.out.println(getMax(c, d));
                break;
            case "string":
                String e = scanner.nextLine();
                String g = scanner.nextLine();
                System.out.println(getMax(e, g));
                break;
        }

    }

    static int getMax(int a, int b) {

        if (a > b) {
            return a;
        } else
            return b;
    }

    static char getMax(char a, char b) {

        if ((int) a > (int) b) {
            return a;
        } else
            return b;
    }

    static String getMax(String a, String b) {

        if (a.compareTo(b) >= 0) {
            return a;
        } else {
            return b;
        }

    }
}
