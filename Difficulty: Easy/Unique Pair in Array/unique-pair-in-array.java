class Solution {
    public ArrayList<Integer> findUniquePair(int[] arr) {
        int xor = 0;
        for (int x : arr)
            xor ^= x;
        int bit = xor & -xor;
        int a = 0, b = 0;
        for (int x : arr) {
            if ((x & bit) != 0)
                a ^= x;
            else
                b ^= x;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if (a < b) {
            ans.add(a);
            ans.add(b);
        } else {
            ans.add(b);
            ans.add(a);
        }
        return ans;
    }
}