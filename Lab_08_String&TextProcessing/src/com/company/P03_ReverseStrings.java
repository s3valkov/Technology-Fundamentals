import java.util.Scanner;

public class P03_ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String result = "";

            for (int i = input.length() - 1; i >= 0; i--) {
                char index = input.charAt(i);
                result += index;
            }

            System.out.println(input + " = " + result);
            input = scanner.nextLine();

        }
    }
}
