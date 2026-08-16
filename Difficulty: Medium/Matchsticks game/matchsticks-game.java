class Solution {
    static int matchGame(Long N) {
        long remainder = N % 5;
        if (remainder == 0) {
            return -1;
        }
        return (int) remainder;
    }
}