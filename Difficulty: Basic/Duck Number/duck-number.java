class Solution {
    static boolean check_duck(String num) {
        if (num.length() == 0 || num.charAt(0) == '0') {
            return false;
        }
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '0') {
                return true;
            }
        }
        return false;
    }
}