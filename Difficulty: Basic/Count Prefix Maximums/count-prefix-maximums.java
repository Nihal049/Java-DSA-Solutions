class Solution {
    public int countElements(int[] arr) {
        int count = 1;
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count++;
            }
        }

        return count;
    }
}