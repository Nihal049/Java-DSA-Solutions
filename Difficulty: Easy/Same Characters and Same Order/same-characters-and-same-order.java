class Solution {
    public boolean sameSeq(String s1, String s2) {
        int i = 0;
        int j = 0;
        while(i < s1.length() && j < s2.length()) {
            if(s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                if(i > 0 && s1.charAt(i) == s1.charAt(i - 1))
                    i++;
                else if(j > 0 && s2.charAt(j) == s2.charAt(j - 1))
                    j++;
                else
                    return false;
            }
        }
        while(i < s1.length()) {
            if(s1.charAt(i) != s1.charAt(i - 1))
                return false;
            i++;
        }
        while(j < s2.length()) {
            if(s2.charAt(j) != s2.charAt(j - 1))
                return false;
            j++;
        }
        return true;
    }
}