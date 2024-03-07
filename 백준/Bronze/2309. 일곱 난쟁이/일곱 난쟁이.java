import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[9];
        for (int i = 0; i < 9; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        findCombination(numbers, bw);
        bw.flush();

    }

    public static void findCombination(int[] numbers, BufferedWriter bw) throws IOException {
        int n = numbers.length;
        for (int i = 0; i < (1<<n); i++) {
            List<Integer> combination = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    combination.add(numbers[j]);
                }
            }
            if (combination.size() == 7 && combination.stream().mapToInt(Integer::intValue).sum() == 100) {
                combination.stream().sorted().forEach(e -> {
                    try {
                        bw.write(e + "\n");
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                });
                break;
            }
        }
    }
}