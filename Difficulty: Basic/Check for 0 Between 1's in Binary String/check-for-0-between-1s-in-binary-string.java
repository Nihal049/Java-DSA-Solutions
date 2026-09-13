class Solution {
    public boolean checkBinary(String s) {
        int firstOne = -1;
        int lastOne = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                if (firstOne == -1) {
                    firstOne = i;
                }
                lastOne = i;
            }
        }

        if (firstOne == -1 || firstOne == lastOne) {
            return true;
        }

        for (int i = firstOne + 1; i < lastOne; i++) {
            if (s.charAt(i) == '0') {
                return false;
            }
        }

        return true;
    }
}