class Solution {
    public int countOccurence(int[] arr, int k) {
        int n = arr.length;
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        int limit = n / k;
        for (int freq : frequencyMap.values()) {
            if (freq > limit) {
                count++;
            }
        }
        return count;
    }
}