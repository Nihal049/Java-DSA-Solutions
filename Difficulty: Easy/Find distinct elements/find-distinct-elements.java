import java.util.*;
class Solution {
    public int distinct(int[] a, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++)
            set.add(a[i]);
        return set.size();
    }
}