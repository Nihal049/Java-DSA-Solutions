class Solution {
    public String toggleCase(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z')
                ans.append((char)(c - 32));
            else if(c >= 'A' && c <= 'Z')
                ans.append((char)(c + 32));
            else
                ans.append(c);
        }
        return ans.toString();
    }
}