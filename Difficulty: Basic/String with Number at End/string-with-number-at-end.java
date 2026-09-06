class Solution {
    int isSame(String s) {
        int n = s.length();
        int i = n - 1;
        while (i >= 0 && Character.isDigit(s.charAt(i))) {
            i--;
        }
        if (i == -1) return 0;
        String numStr = s.substring(i + 1);
        if (numStr.length() == 0) return 0;
        int num;
        try {
            num = Integer.parseInt(numStr);
        } catch (NumberFormatException e) {
            return 0;
        }
        String strPart = s.substring(0, i + 1);
        return (strPart.length() == num) ? 1 : 0;
    }
}