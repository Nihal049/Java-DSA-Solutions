class Solution {
    public boolean isCircular(String s) {
        int x = 0;
        int y = 0;
        int dir = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'L')
                dir = (dir + 3) % 4;
            else if(c == 'R')
                dir = (dir + 1) % 4;
            else {
                if(dir == 0)
                    y++;
                else if(dir == 1)
                    x++;
                else if(dir == 2)
                    y--;
                else
                    x--;
            }
        }
        return x == 0 && y == 0;
    }
}