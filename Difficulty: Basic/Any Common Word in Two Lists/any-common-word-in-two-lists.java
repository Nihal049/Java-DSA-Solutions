class Solution {
    public boolean commonString(String[] s, String[] t) {
        java.util.HashSet<String> set = new java.util.HashSet<>();
        for (String str : s) {
            set.add(str);
        }
        for (String str : t) {
            if (set.contains(str)) {
                return true;
            }
        }
        return false;
    }
}