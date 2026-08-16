import java.util.*;
class Solution {
    public int countDistinct(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr)
            set.add(x);
        return set.size();
    }
}