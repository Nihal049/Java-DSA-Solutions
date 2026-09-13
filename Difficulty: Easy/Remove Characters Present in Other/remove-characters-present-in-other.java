class Solution {
    String removeChars(String s1, String s2) {
        boolean[] present = new boolean[26];
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s2.length(); i++) {
            present[s2.charAt(i) - 'a'] = true;
        }
        for(int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if(!present[c - 'a']) {
                ans.append(c);
            }
        }
        return ans.toString();
    }
}