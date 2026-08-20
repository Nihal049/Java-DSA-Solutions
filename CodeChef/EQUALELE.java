import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            Map<Integer, Integer> freq = new HashMap<>();
            int maxFreq = 0;
            for (int i = 0; i < N; i++) {
                int val = sc.nextInt();
                int count = freq.getOrDefault(val, 0) + 1;
                freq.put(val, count);
                if (count > maxFreq) {
                    maxFreq = count;
                }
            }
            System.out.println(N - maxFreq);
        }
    }
}