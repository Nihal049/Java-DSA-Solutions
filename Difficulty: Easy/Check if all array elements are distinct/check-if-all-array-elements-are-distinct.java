import java.util.*;
class Solution {
    public boolean isDistinct(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) {
            if (!set.add(x))
                return false;
        }
        return true;
    }
}