
import java.util.Scanner;

public class Main {
        static String remove(String str) {
            StringBuilder sb = new StringBuilder();
            char lastChar = '\0';

            for(char c : str.toCharArray()) {
                if(c != lastChar) {
                    sb.append(c);
                    lastChar = c;
                }
            }
            return sb.toString();
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i=0;i<count;i++) {
            String str = sc.next();
            str = remove(str);
            System.out.println(str);
        }
    }
}