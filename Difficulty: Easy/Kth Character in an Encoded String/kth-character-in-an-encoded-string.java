class Solution {
    public char decodeIt(String s, long k) {
        long len = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z') {
                len++;
            } else {
                len = len * (c - '0');
            }
        }
        for(int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z') {
                len--;
                if(k == len + 1)
                    return c;
            } else {
                int d = c - '0';
                len = len / d;
                k = (k - 1) % len + 1;
            }
        }
        return ' ';
    }
}