class Solution {
    public boolean isPalinArray(int[] arr) {
        for (int num : arr) {
            int original = num;
            int reverse = 0;
            while (num > 0) {
                reverse = reverse * 10 + num % 10;
                num /= 10;
            }
            if (original != reverse) {
                return false;
            }
        }
        return true;
    }
}