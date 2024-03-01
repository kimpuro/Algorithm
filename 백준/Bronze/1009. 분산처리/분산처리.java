import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++){
            int a = sc.nextInt() % 10;
            int b = sc.nextInt();

            if (a == 0 || b == 0) {
                System.out.println(10);
            } else {
                b = b % 4 == 0 ? 4 : b % 4;
                int res = (int) Math.pow(a, b) % 10;
                System.out.println(res);
            }
        }
    }
}