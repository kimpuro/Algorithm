import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.next();
        String num = sc.next();
        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            sum += Character.getNumericValue(num.charAt(i));
        }

        System.out.println(sum);
    }
}