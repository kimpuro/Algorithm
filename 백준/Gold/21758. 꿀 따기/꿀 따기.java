import java.util.Scanner;

public class Main {
    static long[] honey;
    static long[] sum;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        honey = new long[n + 1];
        sum = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            honey[i] = sc.nextLong();
            sum[i] = sum[i - 1] + honey[i];
        }
        long max1 = bBT();
        long max2 = tBB();
        long max3 = bTB();
        long max = Math.max(max1, max2);
        System.out.print(Math.max(max, max3));
    }

    static long bBT() {
        long max = 0;
        for (int i = 2; i < n; i++) {
            long leftBee = sum[n] - honey[1] - honey[i];
            long rightBee = sum[n] - sum[i];
            if (max < (leftBee + rightBee)) {
                max = leftBee + rightBee;
            }
        }
        return max;
    }

    static long tBB() {
        long max = 0;
        for (int i = 2; i < n; i++) {
            long leftBee = sum[n - 1] - honey[i];
            long rightBee = sum[i - 1];
            if (max < leftBee + rightBee) {
                max = leftBee + rightBee;
            }
        }
        return max;
    }

    static long bTB() {
        long max = 0;
        for (int i = 2; i < n; i++) {
            long leftBee = sum[i] - honey[1];
            long rightBee = sum[n] - sum[i - 1]-honey[n];
            if (max < leftBee + rightBee) {
                max = leftBee + rightBee;
            }
        }
        return max;
    }
}