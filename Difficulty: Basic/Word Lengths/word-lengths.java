class Solution {
    ArrayList<Integer> wordLengths(String s) {
        ArrayList<Integer> res = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                res.add(count);
                count = 0;
            } else {
                count++;
            }
        }
        res.add(count);
        return res;
    }
}