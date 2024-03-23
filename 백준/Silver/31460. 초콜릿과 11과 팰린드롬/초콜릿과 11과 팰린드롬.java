import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int N = sc.nextInt();
            createPalindrome(N);
        }
    }

    public static void createPalindrome(int N) {
        if(N >= 4) {
            BigInteger firstCase = new BigInteger("11").multiply(new BigInteger("10").pow(N-2).add(BigInteger.ONE));
            System.out.println(firstCase);
        } else if(N == 1) {
            System.out.println("0");
        } else if(N == 2) {
            System.out.println("11");
        } else if(N == 3) {
            System.out.println("121");
        }
    }
}