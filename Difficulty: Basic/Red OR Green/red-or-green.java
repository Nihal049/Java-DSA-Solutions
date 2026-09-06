class Solution {
    public int redOrGreen(String s) {
        int r = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') r++;
        }
        return Math.min(r, s.length() - r);
    }
}