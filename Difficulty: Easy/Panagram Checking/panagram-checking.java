class Solution {
    public static boolean checkPangram(String s) {
        if (s == null || s.length() < 26) {
            return false;
        }
        boolean[] present = new boolean[26];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                int index = c - 'A';
                if (!present[index]) {
                    present[index] = true;
                    count++;
                }
            } else if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                if (!present[index]) {
                    present[index] = true;
                    count++;
                }
            }
            if (count == 26) {
                return true;
            }
        }
        return count == 26;
    }
}