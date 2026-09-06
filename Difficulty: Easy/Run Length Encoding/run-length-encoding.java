class Solution {
    public static String encode(String s) {
        StringBuilder result = new StringBuilder();
        int n = s.length();
        int i = 0;
        while (i < n) {
            char current = s.charAt(i);
            int count = 0;
            while (i < n && s.charAt(i) == current) {
                count++;
                i++;
            }
            result.append(current).append(count);
        }
        return result.toString();
    }
}