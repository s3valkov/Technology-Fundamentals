package com.company;

import java.util.Scanner;

public class P06_RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double area = calculateRectangleArea(width, height);

        System.out.printf("%.0f", area);
    }

    static double calculateRectangleArea(double width, double height) {
        return width * height;
    }
}
