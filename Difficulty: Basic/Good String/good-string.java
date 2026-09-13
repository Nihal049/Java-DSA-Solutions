class Solution {
    public boolean isGoodString(String s) {
        if (s.length() <= 1) {
            return true;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            int diff = Math.abs(s.charAt(i) - s.charAt(i + 1));
            int cyclicDiff = Math.min(diff, 26 - diff);

            if (cyclicDiff != 1) {
                return false;
            }
        }

        return true;
    }
}