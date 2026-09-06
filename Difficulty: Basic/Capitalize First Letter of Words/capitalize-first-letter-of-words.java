class Solution {
    public String convert(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        char[] chars = s.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);

        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == ' ') {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }

        return new String(chars);
    }
};