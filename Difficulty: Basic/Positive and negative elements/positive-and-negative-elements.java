import java.util.*;

class Solution {
    public ArrayList<Integer> arranged(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int x : arr) {
            if (x > 0)
                pos.add(x);
            else
                neg.add(x);
        }

        int i = 0, j = 0;

        while (i < pos.size() && j < neg.size()) {
            ans.add(pos.get(i++));
            ans.add(neg.get(j++));
        }

        while (i < pos.size())
            ans.add(pos.get(i++));

        while (j < neg.size())
            ans.add(neg.get(j++));

        return ans;
    }
}