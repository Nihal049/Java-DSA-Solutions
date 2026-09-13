class Solution {
    public String arrangeString(String s, int x, int y) {
        int zero = 0;
        int one = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0')
                zero++;
            else
                one++;
        }
        StringBuilder ans = new StringBuilder();
        while(zero > 0 || one > 0) {
            for(int i = 0; i < x && zero > 0; i++) {
                ans.append('0');
                zero--;
            }
            for(int i = 0; i < y && one > 0; i++) {
                ans.append('1');
                one--;
            }
        }
        return ans.toString();
    }
}