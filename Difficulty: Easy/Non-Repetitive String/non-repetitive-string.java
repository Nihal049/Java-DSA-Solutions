class Solution {
    public boolean nonRepetitive(String s) {
        Set<Character> seen = new HashSet<>();
        char prev = '\0';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != prev) {
                if (seen.contains(c)) {
                    return false;
                }
                seen.add(c);
                prev = c;
            }
        }
        return true;
    }
}