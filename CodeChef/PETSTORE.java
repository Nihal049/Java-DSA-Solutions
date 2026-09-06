import java.util.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            int[] freq = new int[101];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                freq[Integer.parseInt(st.nextToken())]++;
            }
            boolean possible = true;
            for (int f : freq) {
                if (f % 2 != 0) {
                    possible = false;
                    break;
                }
            }
            sb.append(possible ? "YES" : "NO").append("\n");
        }
        System.out.print(sb);
    }
}