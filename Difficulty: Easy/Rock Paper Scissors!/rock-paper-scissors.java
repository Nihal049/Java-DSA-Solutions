import java.util.*;
class Solution {
    public int[] solveRPS(String a, String b, int k) {
        int n = a.length();
        int m = b.length();
        int cycle = n * m;
        int awin = 0;
        int bwin = 0;
        for(int i = 0; i < cycle; i++) {
            char x = a.charAt(i % n);
            char y = b.charAt(i % m);
            if((x == 'R' && y == 'S') || (x == 'S' && y == 'P') || (x == 'P' && y == 'R'))
                awin++;
            else if((y == 'R' && x == 'S') || (y == 'S' && x == 'P') || (y == 'P' && x == 'R'))
                bwin++;
        }
        int full = k / cycle;
        int rem = k % cycle;
        awin = awin * full;
        bwin = bwin * full;
        for(int i = 0; i < rem; i++) {
            char x = a.charAt(i % n);
            char y = b.charAt(i % m);
            if((x == 'R' && y == 'S') || (x == 'S' && y == 'P') || (x == 'P' && y == 'R'))
                awin++;
            else if((y == 'R' && x == 'S') || (y == 'S' && x == 'P') || (y == 'P' && x == 'R'))
                bwin++;
        }
        return new int[]{awin, bwin};
    }
}