class Solution {
    public int findMissing(int[] arr1, int[] arr2) {
        int result = 0;
        for (int x : arr1)
            result ^= x;
        for (int x : arr2)
            result ^= x;
        return result;
    }
}