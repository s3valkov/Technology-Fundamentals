package com.company;

import java.util.Scanner;

public class P09_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double sabres = Double.parseDouble(scanner.nextLine());
        double robes = Double.parseDouble(scanner.nextLine());
        double belts = Double.parseDouble(scanner.nextLine());

        double sum = 0;
        sum = sabres * Math.ceil(students * 1.1) + robes * students + belts * (students - students / 6);

        if (money >= sum) {
            System.out.printf("The money is enough - it would cost %.2flv.", sum);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", sum - money);
        }

    }
}
