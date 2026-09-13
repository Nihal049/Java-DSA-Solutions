class Solution {
    public String boomNumber(int k) {
        long len = 1;
        long count = 2;
        while (k > count) {
            k -= (int) count;
            len++;
            count *= 2;
        }
        long idx = k - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = (int) len - 1; i >= 0; i--) {
            sb.append(((idx >> i) & 1) == 1 ? '3' : '2');
        }
        return sb.toString();
    }
}