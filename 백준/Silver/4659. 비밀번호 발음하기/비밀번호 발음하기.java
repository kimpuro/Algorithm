import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    private static final Set<Character> VOWELS = new HashSet<Character>() {{
        add('a'); add('e'); add('i'); add('o'); add('u');
    }};

    private int type(char c) {
        return VOWELS.contains(c) ? 1 : -1;
    }

    private boolean hasOne(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (type(s.charAt(i)) == 1) {
                return true;
            }
        }
        return false;
    }

    private boolean hasNoThree(String s) {
        int chk = 0;
        for (int i = 0; i < s.length(); i++) {
            int type = type(s.charAt(i));
            if (type > 0 && chk > 0) chk++;
            else if (type < 0 && chk < 0) chk--;
            else chk = type;
            if (Math.abs(chk) == 3) return false;
        }
        return true;
    }

    private boolean hasNoTwo(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1) == s.charAt(i) && s.charAt(i) != 'e' && s.charAt(i) != 'o') return false;
        }
        return true;
    }

    private boolean check(String s) {
        return hasOne(s) && hasNoThree(s) && hasNoTwo(s);
    }

    private void inputOutput() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            if (s.equals("end")) break;
            System.out.println(String.format(check(s)?"<%s> is acceptable.":"<%s> is not acceptable.", s));
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().inputOutput();
    }
}