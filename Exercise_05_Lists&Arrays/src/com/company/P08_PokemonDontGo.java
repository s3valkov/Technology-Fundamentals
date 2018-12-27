package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08_PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int lastIndex = numbers.size() - 1;
        int sum = 0;
        while (numbers.size() != 0) {

            int index = Integer.parseInt(scanner.nextLine());
            int element = 0;

            if (index >= numbers.size()) {
                element = numbers.get(numbers.size() - 1);
                numbers.remove(numbers.size() - 1);
                numbers.add(numbers.get(0));
            } else if (index < 0) {
                element = numbers.get(0);
                numbers.remove(0);
                numbers.add(0, numbers.get(numbers.size() - 1));
            } else {
                element = numbers.get(index);
                numbers.remove(index);
            }

            sum += element;

            for (int i = 0; i < numbers.size(); i++) {

                if (element >= numbers.get(i)) {
                    numbers.set(i, numbers.get(i) + element);
                } else {
                    numbers.set(i, numbers.get(i) - element);
                }

            }

        }
        System.out.println(sum);

    }


}

