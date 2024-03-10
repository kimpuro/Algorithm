import java.util.*;

public class Main {

    public static boolean solve(String sequence) {
        long move = 0, count = 0;
        char current = '.';

        StringBuilder builder = new StringBuilder(sequence);
        sequence = builder.reverse().toString();

        for (char c : sequence.toCharArray()) {
            if (current == '.') {
                current = c;
            }
            if (current == '.') {
                continue;
            }
            if (c == '.') {
                move += (current == 'W' ? +1 : -1) * count;
            } else if (c == current) {
                count++;
            } else {
                current = '.';
                count = 0;
            }
        }
        return move > 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        while (T-- > 0) {
            String s = input.next();
            System.out.println(solve(s) ? "WHITE" : "BLACK");
        }
        input.close();
    }
}