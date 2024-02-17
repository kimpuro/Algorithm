import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        while (true) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0) {
                break;
            }
            int sum = num1 + num2;
            output.append(sum).append("\n");
        }
        System.out.print(output);
    }
}
