import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wordCount = 0;
        while (scanner.hasNext()) {
            scanner.next();
            wordCount++;
        }
        System.out.println(wordCount);
    }
}