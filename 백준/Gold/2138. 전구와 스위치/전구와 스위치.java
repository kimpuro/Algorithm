import java.io.*;
import java.util.Arrays;

public class Main {
    static int n;
    static int[] org, want, tmp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        org = new int[100001];
        want = new int[100001];
        tmp = new int[100001];

        String str = br.readLine();
        for(int i = 1; i <=n; i++)
            org[i] = str.charAt(i - 1) - '0';

        str = br.readLine();
        for(int i = 1; i <=n; i++)
            want[i] = str.charAt(i - 1) - '0';

        int ans1 = 0;
        System.arraycopy(org, 0, tmp, 0, 100001);

        for (int i = 2; i <= n; i++) {
            if (tmp[i - 1] != want[i - 1]) {
                change(i);
                ans1++;
            }
        }

        if (check())
            bw.write(ans1 + "\n");
        else {
            int ans2 = 1;
            Arrays.fill(tmp, 0);
            System.arraycopy(org, 0, tmp, 0, 100001);
            change(1);

            for (int i = 2; i <= n; i++) {
                if (tmp[i - 1] != want[i - 1]) {
                    change(i);
                    ans2++;
                }
            }

            if (check())
                bw.write(ans2 + "\n");
            else
                bw.write("-1\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    private static void change(int index) {
        for (int d = -1; d <= 1; d++) {
            int i = index + d;
            if (i < 1 || i > n) continue;
            tmp[i] = 1 - tmp[i];
        }
    }

    private static boolean check() {
        for (int i = 1; i <= n; i++)
            if (tmp[i] != want[i])
                return false;
        return true;
    }
}