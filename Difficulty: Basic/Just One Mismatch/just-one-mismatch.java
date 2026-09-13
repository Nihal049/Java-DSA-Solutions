class Solution {
    public boolean isStringExist(String s, String[] arr) {
        int n = s.length();

        for (String str : arr) {
            if (str.length() != n) {
                continue;
            }

            int diffCount = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != str.charAt(i)) {
                    diffCount++;
                    if (diffCount > 1) {
                        break;
                    }
                }
            }

            if (diffCount == 1) {
                return true;
            }
        }

        return false;
    }
}