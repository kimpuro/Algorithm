import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < T; i++) {
            String expression = scanner.nextLine();
            int a = countExclamationMarks(expression, true);
            int b = countExclamationMarks(expression, false);
            int n = Character.getNumericValue(expression.charAt(a));
            n = (b > 0) ? 1 : n;
            n = (a % 2 == 0) ? n : 1 - n;
            System.out.println(n);
        }
    }

    private static int countExclamationMarks(String str, boolean atStart) {
        int count = 0;
        while ((atStart ? str.charAt(count) : str.charAt(str.length() - 1 - count)) == '!') {
            count++;
        }
        return count;
    }
}