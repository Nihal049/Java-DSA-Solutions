class Solution {
    public int[] getDigitDiff1AndLessK(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num >= k || num < 10)
                continue;
            int x = num;
            boolean valid = true;
            while (x >= 10) {
                int d1 = x % 10;
                int d2 = (x / 10) % 10;
                if (Math.abs(d1 - d2) != 1) {
                    valid = false;
                    break;
                }
                x /= 10;
            }
            if (valid)
                list.add(num);
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            ans[i] = list.get(i);
        return ans;
    }
}