class Solution {
    public boolean halvesMatch(String s) {
        int n = s.length();
        int half = n / 2;
        int[] count = new int[256];
        for (int i = 0; i < half; i++) {
            count[s.charAt(i)]++;
            count[s.charAt(n - 1 - i)]--;
        }
        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
    }
}