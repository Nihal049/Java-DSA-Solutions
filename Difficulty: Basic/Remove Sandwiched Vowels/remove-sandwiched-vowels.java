class Solution {
    public String sandwichedVowel(String s) {
        if (s == null || s.length() < 3) {
            return s;
        }

        StringBuilder result = new StringBuilder();
        char[] chars = s.toCharArray();
        int n = chars.length;

        for (int i = 0; i < n; i++) {
            char c = chars[i];
            boolean isVowel = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');

            if (isVowel && i > 0 && i < n - 1) {
                char prev = chars[i - 1];
                char next = chars[i + 1];
                boolean prevIsConsonant = prev >= 'a' && prev <= 'z' && !isVowel(prev);
                boolean nextIsConsonant = next >= 'a' && next <= 'z' && !isVowel(next);

                if (prevIsConsonant && nextIsConsonant) {
                    continue;
                }
            }

            result.append(c);
        }

        return result.toString();
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}