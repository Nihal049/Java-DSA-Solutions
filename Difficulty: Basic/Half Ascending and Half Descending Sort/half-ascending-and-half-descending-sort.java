import java.util.*;

class Solution {
    public ArrayList<Integer> customSort(int[] arr) {
        int n = arr.length;
        int mid = n / 2;
        ArrayList<Integer> ans = new ArrayList<>();

        Arrays.sort(arr, 0, mid);
        Arrays.sort(arr, mid, n);

        for (int i = 0; i < mid; i++) {
            ans.add(arr[i]);
        }

        for (int i = n - 1; i >= mid; i--) {
            ans.add(arr[i]);
        }

        return ans;
    }
}