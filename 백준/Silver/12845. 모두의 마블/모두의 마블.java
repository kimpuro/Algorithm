import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        List<Integer> level = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            level.add(Integer.parseInt(st.nextToken()));
        }
        level.sort(Collections.reverseOrder());
        bw.write(String.valueOf(sumOfArr(level, N)));
        bw.flush();
    }

    public static int sumOfArr(List<Integer> level, int N) {
        int gold = 0;
        while (level.size() > 1) {
            gold += level.get(0) + level.get(1);
            level.remove(1);
        }
        return gold;
    }
}