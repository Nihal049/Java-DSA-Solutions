class Solution {
    public String altCase(String s) {
        char[] chars = s.toCharArray();
        boolean evenShouldBeUpper = Character.isUpperCase(chars[0]);
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                chars[i] = evenShouldBeUpper ? Character.toUpperCase(chars[i]) : Character.toLowerCase(chars[i]);
            } else {
                chars[i] = evenShouldBeUpper ? Character.toLowerCase(chars[i]) : Character.toUpperCase(chars[i]);
            }
        }
        return new String(chars);
    }
}