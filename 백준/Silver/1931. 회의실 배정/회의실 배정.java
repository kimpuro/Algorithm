import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] meetings = new int[N][2];

        for(int i=0; i < N; i++) {
            meetings[i][0] = scanner.nextInt();
            meetings[i][1] = scanner.nextInt();
        }

        Arrays.sort(meetings, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return Integer.compare(o1[0], o2[0]);
            }
            return Integer.compare(o1[1], o2[1]);
        });

        int count = 0;
        int endTime = -1;

        for (int i = 0; i < N; i++) {
            if (meetings[i][0] >= endTime) {
                count++;
                endTime = meetings[i][1];
            }
        }

        System.out.println(count);
    }
}