import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        bw.write(String.valueOf(sumOfArr(arr)));
        bw.flush();
    }

    public static int sumOfArr(int[] arr) {
        int sum = 0;
        int accumulatedSum = 0;

        for (int i = 0; i < arr.length; i++) {
            accumulatedSum += arr[i];
            sum += accumulatedSum;
        }

        return sum;
    }
}