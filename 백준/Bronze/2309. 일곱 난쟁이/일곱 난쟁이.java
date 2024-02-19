import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[9];
        for (int i = 0; i < 9; i++) {
            numbers[i] = scanner.nextInt();
        }
        findCombination(numbers);
    }

    public static void findCombination(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < (1<<n); i++) {
            List<Integer> combination = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    combination.add(numbers[j]);
                }
            }
            if (combination.size() == 7 && combination.stream().mapToInt(Integer::intValue).sum() == 100) {
                combination.stream().sorted().forEach(System.out::println);
                break;
            }
        }
    }
}