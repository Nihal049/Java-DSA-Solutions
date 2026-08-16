class Solution {
    public int maxDays(int[] arr) {
        int max = 0;
        for (int x : arr) {
            max = Math.max(max, x);
        }
        return max;
    }
}