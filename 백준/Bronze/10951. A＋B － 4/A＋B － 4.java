import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        while (true) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            output.append(sum).append("\n");
            if (!scanner.hasNext()) {
                break;
            }
        }
        System.out.print(output);
    }
}
