class Solution {
    public static String missingPanagram(String s) {
        boolean[] present = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c >= 'a' && c <= 'z') {
                present[c - 'a'] = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (!present[i]) {
                sb.append((char) ('a' + i));
            }
        }
        return sb.length() == 0 ? "-1" : sb.toString();
    }
}