import java.io.*;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String[] input = br.readLine().split(" ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);
        bw.write(String.valueOf(sumOfArr(arr)));
        bw.flush();
    }

    public static int sumOfArr(int[] arr) {
        int sum = 0;
        int acSum = 0;

        for (int i = 0; i < arr.length; i++) {
            acSum += arr[i];
            sum += acSum;
        }

        return sum;
    }
}