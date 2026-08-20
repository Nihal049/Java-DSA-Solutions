import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T--> 0) {
            int n = sc.nextInt();
            int[] d = new int[n];
            for (int i = 0; i < n; i++) {
                d[i] = sc.nextInt();
            }
            Arrays.sort(d);
            int count = 0;
            int lastPartyDay = 0;
            for (int i = 0; i < n; i++) {
                if (d[i] > lastPartyDay) {
                    count++;
                    lastPartyDay = d[i];
                }
            }
            System.out.println(count);
        }
    }
}