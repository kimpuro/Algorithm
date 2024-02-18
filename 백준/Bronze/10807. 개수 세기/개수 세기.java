import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = scanner.nextInt();
        }
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i] == number) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}