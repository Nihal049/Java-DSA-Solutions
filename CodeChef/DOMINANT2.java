import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            Map<Integer, Integer> freq = new HashMap<>();
            for (int i = 0; i < N; i++) {
                int num = sc.nextInt();
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }
            int maxFreq = 0;
            for (int f : freq.values()) {
                if (f > maxFreq) {
                    maxFreq = f;
                }
            }
            int countMax = 0;
            for (int f : freq.values()) {
                if (f == maxFreq) {
                    countMax++;
                }
            }
            if (countMax == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}