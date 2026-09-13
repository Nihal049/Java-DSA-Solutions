class Solution {
    public int compareStrings(String s1, String s2) {
        int i = 0;
        int j = 0;
        while(i < s1.length() && j < s2.length()) {
            int a = getValue(s1, i);
            int b = getValue(s2, j);
            if(a > b) return 1;
            if(a < b) return -1;
            if(a == 14) i += 2;
            else i++;
            if(b == 14) j += 2;
            else j++;
        }
        if(i < s1.length()) return 1;
        if(j < s2.length()) return -1;
        return 0;
    }
    int getValue(String s, int i) {
        if(i + 1 < s.length() && s.charAt(i) == 'n' && s.charAt(i + 1) == 'g')
            return 14;
        if(s.charAt(i) >= 'o')
            return s.charAt(i) - 'a' + 1;
        return s.charAt(i) - 'a';
    }
}