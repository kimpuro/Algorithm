import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        int aCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                aCount++;
            }
        }

        int minB = Integer.MAX_VALUE;
        int currentB = 0;

        for (int i = 0; i < aCount; i++) {
            if (str.charAt(i) == 'b') {
                currentB++;
            }
        }

        minB = Math.min(minB, currentB);

        for (int i = 0; i < str.length(); i++) {
            int startIdx = i;
            int endIdx = (i + aCount) % str.length();

            if (str.charAt(startIdx) == 'b') {
                currentB--;
            }

            if (str.charAt(endIdx) == 'b') {
                currentB++;
            }

            minB = Math.min(minB, currentB);
        }

        bw.write(String.valueOf(minB));
        bw.flush();
    }
}
