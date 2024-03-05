import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        line(n);
        blank(n);
        line(n);
        blank(n);
        line(n);


    }

    static void blank(int n) {
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print("@");
            }System.out.println();


        }

    }

    static void line(int n) {

        for(int k=0;k<n;k++) {
            for (int j = 0; j < 5; j++) {
                for (int i = 0; i < n; i++) {
                    System.out.print("@");
                }

            }
            System.out.println();
        }
    }
}