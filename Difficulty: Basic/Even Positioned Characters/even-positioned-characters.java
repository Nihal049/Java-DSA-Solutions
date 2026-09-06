class Solution {
    public static void utility(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            sb.append(s.charAt(i));
        }
        System.out.print(sb.toString());
    }
}