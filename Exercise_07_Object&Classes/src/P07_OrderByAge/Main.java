package P07_OrderByAge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Person> people = new ArrayList<>();


        while (true) {
            String line = scanner.nextLine();

            if (line.equals("End")) {
                break;
            }


            String[] data = line.split("\\s+");
            Person person = new Person(data[0], data[1], Integer.parseInt(data[2]));
            people.add(person);
        }

        people.stream()
                .sorted((f, s) -> Integer.compare(f.getAge(), s.getAge()))
                .forEach(p -> System.out.println(p.toString()));
    }
}
