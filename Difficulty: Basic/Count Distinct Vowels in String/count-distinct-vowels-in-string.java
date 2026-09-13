class Solution {
    public int countVowels(String s) {
        int mask = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a') mask |= 1;
            else if (c == 'e') mask |= 2;
            else if (c == 'i') mask |= 4;
            else if (c == 'o') mask |= 8;
            else if (c == 'u') mask |= 16;
        }
        return Integer.bitCount(mask);
    }
}