package P05_Students;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Student> students = new ArrayList<>();

        while (n-- > 0) {

            String[] data = scanner.nextLine().split("\\s+");
            String firstName = data[0];
            String secondName = data[1];
            double grade = Double.parseDouble(data[2]);

            Student student = new Student(firstName, secondName, grade);
            students.add(student);
        }

        students.stream()
                .sorted((f, s) -> Double.compare(s.getGrade(), f.getGrade()))
                .forEach(s -> System.out.println(s.toString()));
    }
}
