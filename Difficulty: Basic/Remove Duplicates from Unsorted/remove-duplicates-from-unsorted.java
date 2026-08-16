import java.util.*;

class Solution {
    public ArrayList<Integer> removeDuplicate(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            if (set.add(x)) {
                ans.add(x);
            }
        }

        return ans;
    }
}