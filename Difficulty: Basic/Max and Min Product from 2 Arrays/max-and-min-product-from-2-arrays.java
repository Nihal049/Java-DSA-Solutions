class Solution {
    public long minMaxProduct(int[] arr1, int[] arr2) {
        int max = arr1[0];
        int min = arr2[0];

        for (int i = 1; i < arr1.length; i++) {
            max = Math.max(max, arr1[i]);
        }

        for (int i = 1; i < arr2.length; i++) {
            min = Math.min(min, arr2[i]);
        }

        return (long) max * min;
    }
}