class Solution {
    String modify(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        char first = s.charAt(0);
        boolean isFirstUpper = Character.isUpperCase(first);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isFirstUpper) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(Character.toLowerCase(c));
            }
        }

        return result.toString();
    }
}