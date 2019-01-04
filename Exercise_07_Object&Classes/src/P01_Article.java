import java.util.Scanner;

class P01_Article {
    private String title;
    private String content;
    private String author;

    public P01_Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void edit(String newContent) {
        this.content = newContent;
    }

    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void rename(String newTitle) {
        this.title = newTitle;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s",
                this.title, this.content, this.author);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split(", ");

        P01_Article article = new P01_Article(data[0], data[1], data[2]);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split(": ");
            String cmd = tokens[0];

            if (cmd.equals("Edit")) {
                article.edit(tokens[1]);
            } else if (cmd.equals("ChangeAuthor")) {
                article.changeAuthor(tokens[1]);
            } else {
                article.rename(tokens[1]);
            }

        }
        System.out.println(article.toString());


    }
}
