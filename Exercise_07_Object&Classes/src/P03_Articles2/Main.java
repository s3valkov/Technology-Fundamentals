package P03_Articles2;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Article> articles = new ArrayList<>();

        while (n-- > 0) {
            String[] data = scanner.nextLine().split(", ");
            String title = data[0];
            String content = data[1];
            String author = data[2];

            Article article = new Article(title, content, author);
            articles.add(article);
        }

        String cmd = scanner.nextLine();

        if (cmd.equals("title")) {
            articles.stream()
                    .sorted((f, s) -> f.getTitle().compareTo(s.getTitle()))
                    .forEach(a -> System.out.println(a.toString()));
        } else if (cmd.equals("content")) {
            articles.stream()
                    .sorted((f, s) -> f.getContent().compareTo(s.getContent()))
                    .forEach(a -> System.out.println(a.toString()));
        } else {
            articles.stream()
                    .sorted((f, s) -> f.getAuthor().compareTo(s.getAuthor()))
                    .forEach(a -> System.out.println(a.toString()));
        }


    }
}
