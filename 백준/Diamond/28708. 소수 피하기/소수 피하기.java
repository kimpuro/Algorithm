import java.util.*;

public class Main {

    static class SimpleFlow {
        private final int N;
        private final List<List<Integer>> G;
        private boolean[] vis;

        SimpleFlow(int n) {
            this.N = n;
            this.G = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                List<Integer> row = new ArrayList<>(Collections.nCopies(N, 0));
                G.add(row);
            }
        }

        void addEdge(int u, int v, int f) {
            G.get(u).set(v, G.get(u).get(v) + f);
        }

        int flow(int s, int t) {
            int ans = 0;
            vis = new boolean[N];

            while (augment(s, t)) {
                ans++;
                vis = new boolean[N];
            }

            return ans;
        }

        private boolean augment(int s, int t) {
            vis[s] = true;

            if (s == t)
                return true;

            for (int i = 0; i < N; i++) {
                if (G.get(s).get(i) > 0 && !vis[i]) {
                    if (augment(i, t)) {
                        G.get(s).set(i, G.get(s).get(i) - 1);
                        G.get(i).set(s, G.get(i).get(s) + 1);

                        return true;
                    }
                }
            }

            return false;
        }

        List<Integer> cut() {
            List<Integer> cut = new ArrayList<>();

            for (int i = 0; i < vis.length; i++)
                if (vis[i])
                    cut.add(i);

            return cut;
        }
    }

    private static List<Integer> solve(List<Integer> A) {
        int MX = Collections.max(A) * 2 + 2;
        boolean[] P = new boolean[MX + 1];
        Arrays.fill(P, true);
        P[0] = false;
        P[1] = false;

        for (int i = 2; i <= MX; i++) {
            if (P[i]) {
                for (int j = 2 * i; j <= MX; j += i) {
                    P[j] = false;
                }
            }
        }

        int N = A.size();
        SimpleFlow flow = new SimpleFlow(N + 2);
        int T = N, F = N + 1, inf = N + 1;

        for (int i = 0; i < N; i++) {
            if (A.get(i) % 2 == 0) {
                flow.addEdge(T, i, 1);
            } else {
                flow.addEdge(i, F, 1);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int Ei = A.get(i), Oj = A.get(j);

                if (Ei % 2 == 1)
                    Ei++;
                if (Oj % 2 == 0)
                    Oj++;

                if (P[Ei + Oj])
                    flow.addEdge(i, j, inf);
            }
        }

        if (Collections.frequency(A, 1) >= 2) {
            for (int i = 0; i < N; i++) {
                if (A.get(i) == 1) {
                    flow.addEdge(T, i, inf);
                }
            }
        }

        flow.flow(T, F);

        List<Integer> res = new ArrayList<>();
        List<Integer> cut = flow.cut();
        for (int i = 0; i < N; i++) {
            if ((A.get(i) % 2 == 1) == cut.contains(i)) {
                res.add(i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextInt());
        }

        List<Integer> ans = solve(A);

        System.out.println(ans.size());
        for (int x : ans) {
            System.out.print(1 + x + " ");
        }
    }
}