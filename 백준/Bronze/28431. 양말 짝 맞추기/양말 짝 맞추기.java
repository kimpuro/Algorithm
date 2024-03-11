import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[5];
        int ans = 0;
        for(int i = 0; i<5;i++){
            arr[i] = Integer.parseInt(br.readLine());
            ans ^= arr[i];
        }
        System.out.println(ans);
    }
}