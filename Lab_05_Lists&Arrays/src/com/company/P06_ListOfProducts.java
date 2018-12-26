package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P06_ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> products = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String currenProduct = scanner.nextLine();
            products.add(currenProduct);
        }

        Collections.sort(products);

        for (int i = 0; i < products.size(); i++) {
            int num = i + 1;
            System.out.println(num + "." + products.get(i));
        }
    }
}
