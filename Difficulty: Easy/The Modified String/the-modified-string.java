class Solution {
    public int modified(String s) {
        int ans = 0;
        int count = 1;
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }
            if(count == 3) {
                ans++;
                count = 1;
            }
        }
        return ans;
    }
}