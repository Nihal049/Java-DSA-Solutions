class Solution {
    public String amendSentence(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= 'A' && c <= 'Z') {
                if(i != 0)
                    ans.append(' ');
                ans.append((char)(c + 32));
            } else {
                ans.append(c);
            }
        }
        return ans.toString();
    }
}