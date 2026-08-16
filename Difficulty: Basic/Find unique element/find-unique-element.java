import java.util.*;
class Solution {
    public int uniqueElement(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr)
            map.put(x, map.getOrDefault(x, 0) + 1);
        for (int x : arr) {
            if (map.get(x) % k != 0)
                return x;
        }
        return -1;
    }
}