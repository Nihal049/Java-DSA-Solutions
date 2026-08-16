class Solution {
    public int minValueToBalance(List<Integer> arr) {
        long left = 0, right = 0;
        int n = arr.size();
        for (int i = 0; i < n / 2; i++) {
            left += arr.get(i);
        }
        for (int i = n / 2; i < n; i++) {
            right += arr.get(i);
        }
        return (int) Math.abs(left - right);
    }
}