class Solution {
    public String[] splitString(String s) {
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder specials = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                letters.append(c);
            } else if (Character.isDigit(c)) {
                digits.append(c);
            } else {
                specials.append(c);
            }
        }

        String[] res = new String[3];
        res[0] = letters.length() > 0 ? letters.toString() : "-1";
        res[1] = digits.length() > 0 ? digits.toString() : "-1";
        res[2] = specials.length() > 0 ? specials.toString() : "-1";

        return res;
    }
}